package com.nestdigital.taskset.dto;

import com.nestdigital.taskset.model.eventType.EventType;
import com.nestdigital.taskset.model.facilities.Facilities;
import com.nestdigital.taskset.model.tasks.Tasks;
import com.nestdigital.taskset.model.units.Units;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnitsEventsFacilityDto {
    private List<EventType> eventType;
    private List<Units> unit;
    private List<Facilities> facilities;
    private List<Tasks> tasks;




}
