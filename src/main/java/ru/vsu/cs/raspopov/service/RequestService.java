package ru.vsu.cs.raspopov.service;

import ru.vsu.cs.raspopov.dto.RequestDto;

public interface RequestService {

    RequestDto applyRequest(RequestDto requestDto);

    void checkRelevanceOfRequests();

}
