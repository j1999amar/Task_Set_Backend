package com.nestdigital.taskset.service.taskSet;


import com.nestdigital.taskset.model.taskSet.TaskSet;

import java.util.List;
import java.util.Optional;

public interface TaskSetService {
    TaskSet updateTaskSet(TaskSet taskSet);
    Optional <TaskSet> findTaskSet (int id);

    List<TaskSet> getTaskSet();

    Optional<TaskSet> getTaskSetById(int id);

    String deleteTaskSet(int id);







}
