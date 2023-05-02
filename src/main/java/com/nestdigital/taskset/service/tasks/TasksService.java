package com.nestdigital.taskset.service.tasks;

import com.nestdigital.taskset.model.tasks.Tasks;

import java.util.List;
import java.util.Optional;

public interface TasksService {
    Optional<Tasks> findTask(int id);
}
