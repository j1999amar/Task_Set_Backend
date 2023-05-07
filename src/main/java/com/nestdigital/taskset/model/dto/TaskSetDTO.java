package com.nestdigital.taskset.model.dto;

import com.nestdigital.taskset.model.dao.EventType;
import com.nestdigital.taskset.model.dao.Facilities;
import com.nestdigital.taskset.model.dao.Tasks;
import com.nestdigital.taskset.model.dao.Units;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskSetDTO {
    private int id;
    private String name;
    private String description;
    private Units unit;
    private EventType eventType;
    private Facilities facilities;
    private boolean applyToAll = false;
    private boolean isdeleted = false;
    private Set<Tasks> tasks;


}
