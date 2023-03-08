package ru.vsu.cs.raspopov.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.cs.raspopov.dto.RequestDto;
import ru.vsu.cs.raspopov.entity.Request;
import ru.vsu.cs.raspopov.entity.Room;
import ru.vsu.cs.raspopov.mapper.RequestMapper;
import ru.vsu.cs.raspopov.repository.RequestRepository;
import ru.vsu.cs.raspopov.repository.RoomRepository;
import ru.vsu.cs.raspopov.service.RequestService;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;
    private final RoomRepository roomRepository;
    private final RequestMapper requestMapper;

    @Override
    public RequestDto applyRequest(RequestDto requestDto) {
        Room room = roomRepository.findFreeRoom(requestDto.getRoomType())
                .orElseThrow(() -> new NoSuchElementException("Can't find needed room"));
        room.setIsFree(true);
        roomRepository.save(room);
        Request request = requestMapper.toEntity(requestDto);
        request = requestRepository.save(request);
        return requestMapper.toDto(request);
    }

    @Override
    public void checkRelevanceOfRequests() {

    }
}
