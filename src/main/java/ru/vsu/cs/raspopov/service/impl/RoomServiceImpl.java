package ru.vsu.cs.raspopov.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.cs.raspopov.dto.RoomDto;
import ru.vsu.cs.raspopov.entity.Room;
import ru.vsu.cs.raspopov.mapper.RoomMapper;
import ru.vsu.cs.raspopov.repository.RoomRepository;
import ru.vsu.cs.raspopov.service.RoomService;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final RoomMapper roomMapper;

    @Override
    public RoomDto addNewRoom(RoomDto roomDto) {
        Room room = roomRepository.save(roomMapper.toEntity(roomDto));
        return roomMapper.toDto(room);
    }
}
