package com.nestdigital.taskset.service.eventType;

import com.nestdigital.taskset.model.eventType.EventType;
import com.nestdigital.taskset.repository.eventType.EventTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EventTypeServiceImpl implements EventTypeService {

    @Autowired
    EventTypeRepository eventTypeRepository;

    @Override
    public Optional<EventType> findEventType(int id) {
        return eventTypeRepository.findById(id);
    }


}
