package com.nestdigital.taskset.dto;

import com.nestdigital.taskset.model.eventType.EventType;
import com.nestdigital.taskset.model.facilities.Facilities;
import com.nestdigital.taskset.model.tasks.Tasks;
import com.nestdigital.taskset.model.units.Units;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class TaskSetDTO {
    private int id;
    private String name;
    private String description;
    private EventType eventType;
    private Units unit;
    private Facilities facilities;
    private boolean applyToAll = false;
    private boolean isdeleted = false;
    private Set<Tasks> tasks;




}
