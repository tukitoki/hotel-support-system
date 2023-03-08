package ru.vsu.cs.raspopov.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.vsu.cs.raspopov.dto.RequestDto;
import ru.vsu.cs.raspopov.dto.RoomDto;
import ru.vsu.cs.raspopov.entity.Request;
import ru.vsu.cs.raspopov.entity.Room;

@Component
public class RoomMapper {

    private final ModelMapper mapper = new ModelMapper();

    public Room toEntity(RoomDto roomDto) {
        Room room = mapper.map(roomDto, Room.class);
        room.setIsFree(true);
        return room;
    }

    public RoomDto toDto(Room room) {
        return mapper.map(room, RoomDto.class);
    }
}
