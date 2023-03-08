package ru.vsu.cs.raspopov.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.vsu.cs.raspopov.entity.enums.RoomType;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
public class RoomTypeCostDto {

    private RoomType roomType;
    private BigDecimal bigDecimal;
}
