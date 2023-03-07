package ru.vsu.cs.raspopov.repository;

import org.springframework.data.repository.CrudRepository;
import ru.vsu.cs.raspopov.entity.Request;

public interface RequestRepository extends CrudRepository<Request, Integer> {
}
