package com.nestdigital.taskset.model.dto;

import com.nestdigital.taskset.model.dao.EventType;
import com.nestdigital.taskset.model.dao.Facilities;
import com.nestdigital.taskset.model.dao.Tasks;
import com.nestdigital.taskset.model.dao.Units;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnitsEventsFacilityDto {
    private List<EventType> eventType;

    private List<Units> unit;

    private List<Facilities> facilities;

    private List<Tasks> tasks;
}
