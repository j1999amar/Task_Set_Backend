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
    private List<EventType> eventType;
    private List<Units> unit;
    private List<Facilities> facilities;
    private List<Tasks> tasks;




}
