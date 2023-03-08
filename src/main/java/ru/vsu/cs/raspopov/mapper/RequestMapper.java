package ru.vsu.cs.raspopov.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.vsu.cs.raspopov.dto.RequestDto;
import ru.vsu.cs.raspopov.entity.Request;

@Component
public class RequestMapper {

    private final ModelMapper mapper = new ModelMapper();

    public Request toEntity(RequestDto requestDto) {
        return mapper.map(requestDto, Request.class);
    }

    public RequestDto toDto(Request request) {
        RequestDto requestDto = mapper.map(request, RequestDto.class);
        requestDto.setRoomType(request.getSettedRoom().getRoomTypeCost().getRoomType());
        return requestDto;
    }
}
