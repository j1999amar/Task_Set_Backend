package com.nestdigital.taskset.service;


import com.nestdigital.taskset.model.dto.TaskSetDTO;
import com.nestdigital.taskset.model.dto.UnitsEventsFacilityDto;
import com.nestdigital.taskset.model.dao.TaskSet;

import java.util.List;
import java.util.Optional;

public interface TaskSetService {
    TaskSet updateTaskSet(TaskSet taskSet);
    Optional <TaskSet> findTaskSet (int id);


    String deleteTaskSet(int id);

    UnitsEventsFacilityDto getUnitsEventsFacilityList(TaskSet taskSet);

    List<TaskSetDTO> getTaskSetAllList();


}
