package com.nestdigital.taskset.service;

import com.nestdigital.taskset.model.dao.EventType;

import java.util.Optional;

public interface EventTypeService {

    Optional<EventType> findEventType(int id);


}
