package com.nestdigital.taskset.service.impl;

import com.nestdigital.taskset.model.dao.Tasks;
import com.nestdigital.taskset.repository.TasksRepository;
import com.nestdigital.taskset.service.TasksService;
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
    public List<Tasks> findAllTask() {
        return tasksRepository.findAll();
    }







}