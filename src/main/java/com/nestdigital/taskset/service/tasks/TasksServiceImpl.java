package com.nestdigital.taskset.service.tasks;

import com.nestdigital.taskset.model.tasks.Tasks;
import com.nestdigital.taskset.repository.tasks.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasksServiceImpl implements TasksService {
    @Autowired
    TasksRepository tasksRepository;
    @Override
    public Optional<Tasks> findTask(int id) {
        return tasksRepository.findById(id);
    }







}
