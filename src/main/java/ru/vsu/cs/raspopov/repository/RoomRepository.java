package ru.vsu.cs.raspopov.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.vsu.cs.raspopov.entity.Room;
import ru.vsu.cs.raspopov.entity.enums.RoomType;

import java.util.Optional;

public interface RoomRepository extends CrudRepository<Room, Integer> {

    @Query(value = "SELECT r FROM Room r WHERE r.isFree = TRUE and r.roomTypeCost = ?1")
    Optional<Room> findFreeRoom(RoomType roomType);
}
