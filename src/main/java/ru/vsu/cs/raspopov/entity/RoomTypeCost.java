package ru.vsu.cs.raspopov.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import ru.vsu.cs.raspopov.entity.enums.RoomType;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "room_type_cost")
public class RoomTypeCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    private BigDecimal price;
}
