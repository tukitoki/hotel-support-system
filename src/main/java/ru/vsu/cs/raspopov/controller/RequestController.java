package ru.vsu.cs.raspopov.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vsu.cs.raspopov.dto.RequestDto;
import ru.vsu.cs.raspopov.entity.Request;
import ru.vsu.cs.raspopov.service.RequestService;
import ru.vsu.cs.raspopov.service.RoomService;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class RequestController {

    private final RequestService requestService;

    @PostMapping("request/apply")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<RequestDto> applyRequest(@RequestBody RequestDto request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(requestService.applyRequest(request));
    }

}
