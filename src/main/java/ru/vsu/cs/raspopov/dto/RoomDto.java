package ru.vsu.cs.raspopov.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class RoomDto {

    private Integer id;

    private RoomTypeCostDto roomTypeCostDto;
}
