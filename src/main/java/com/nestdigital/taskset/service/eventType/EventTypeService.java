package com.nestdigital.taskset.service.eventType;

import com.nestdigital.taskset.model.eventType.EventType;

import java.util.List;
import java.util.Optional;

public interface EventTypeService {

    Optional<EventType> findEventType(int id);


}
