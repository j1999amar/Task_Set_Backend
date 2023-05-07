package com.nestdigital.taskset.service.impl;

import com.nestdigital.taskset.model.dao.EventType;
import com.nestdigital.taskset.repository.EventTypeRepository;
import com.nestdigital.taskset.service.EventTypeService;
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
