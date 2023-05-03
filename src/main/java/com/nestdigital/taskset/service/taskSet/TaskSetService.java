package com.nestdigital.taskset.service.taskSet;


import com.nestdigital.taskset.dto.TaskSetDTO;
import com.nestdigital.taskset.dto.UnitsEventsFacilityDto;
import com.nestdigital.taskset.model.taskSet.TaskSet;

import java.util.List;
import java.util.Optional;

public interface TaskSetService {
    TaskSet updateTaskSet(TaskSet taskSet);
    Optional <TaskSet> findTaskSet (int id);


    String deleteTaskSet(int id);

    UnitsEventsFacilityDto getUnitsEventsFacilityList(TaskSet taskSet);

    List<TaskSetDTO> getTaskSetAllList();


}
