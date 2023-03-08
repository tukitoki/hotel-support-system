package ru.vsu.cs.raspopov.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vsu.cs.raspopov.dto.RoomDto;
import ru.vsu.cs.raspopov.service.RoomService;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @PostMapping("room/add")
    public ResponseEntity<RoomDto> addNewRoom(@RequestBody RoomDto roomDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(roomService.addNewRoom(roomDto));
    }
}
