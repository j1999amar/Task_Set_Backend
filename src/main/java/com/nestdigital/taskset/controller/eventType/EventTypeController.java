package com.nestdigital.taskset.controller.eventType;

import com.nestdigital.taskset.model.eventType.EventType;
import com.nestdigital.taskset.service.eventType.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EventTypeController {

    @Autowired
    EventTypeService eventTypeService;



    @GetMapping(value = "/getEventTypes")
    private List<EventType>  getEventTypes(){
        List<EventType> eventTypeList=eventTypeService.getEventTypes();
        return eventTypeList;
    }
}