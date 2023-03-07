package ru.vsu.cs.raspopov.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.vsu.cs.raspopov.entity.enums.RequestType;
import ru.vsu.cs.raspopov.entity.enums.RoomType;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {

    private Integer id;
    private RoomType roomType;
    private RequestType requestType;
    private Timestamp timeFromBooking;
    private Timestamp timeToBooking;
}
