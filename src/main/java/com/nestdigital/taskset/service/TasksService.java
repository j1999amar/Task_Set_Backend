package com.nestdigital.taskset.service;

import com.nestdigital.taskset.model.dao.Tasks;

import java.util.List;
import java.util.Optional;

public interface TasksService {
    Optional<Tasks> findTask(int id);
    List<Tasks> findAllTask();

}
