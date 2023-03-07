package ru.vsu.cs.raspopov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.cs.raspopov.dto.RequestDto;
import ru.vsu.cs.raspopov.entity.Request;
import ru.vsu.cs.raspopov.entity.Room;
import ru.vsu.cs.raspopov.repository.RequestRepository;
import ru.vsu.cs.raspopov.repository.RoomRepository;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class RequestService {

    private final RequestRepository requestRepository;
    private final RoomRepository roomRepository;

    public RequestDto applyRequest(RequestDto requestDto) {
        Room room = roomRepository.findFreeRoom(requestDto.getRoomType())
                .orElseThrow(() -> new NoSuchElementException("Can't find needed room"));
        room.setIsFree(true);
        roomRepository.save(room);
        Request request = new Request(room, requestDto.getRequestType(),
                requestDto.getTimeFromBooking(), requestDto.getTimeToBooking());
        request = requestRepository.save(request);
        return new RequestDto(request.getId(), request.getSettedRoom().getRoomTypeCost().getRoomType(),
                request.getRequestType(), request.getTimeFromBooking(), request.getTimeToBooking());
    }
}
