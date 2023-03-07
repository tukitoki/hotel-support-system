package ru.vsu.cs.raspopov.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.vsu.cs.raspopov.entity.enums.RequestType;
import ru.vsu.cs.raspopov.entity.enums.RoomType;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Room settedRoom;

    private RequestType requestType;

    private Timestamp timeFromBooking;

    private Timestamp timeToBooking;

    public Request(Room settedRoom, RequestType requestType, Timestamp timeFromBooking, Timestamp timeToBooking) {
        this.settedRoom = settedRoom;
        this.requestType = requestType;
        this.timeFromBooking = timeFromBooking;
        this.timeToBooking = timeToBooking;
    }
}
