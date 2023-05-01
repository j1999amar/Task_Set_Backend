package com.nestdigital.taskset.service.taskSet;

import com.nestdigital.taskset.model.taskSet.TaskSet;
import com.nestdigital.taskset.repository.taskSet.TaskSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskSetServiceImpl implements TaskSetService {
    @Autowired
    TaskSetRepository taskSetRepository;

    @Override
    public TaskSet updateTaskSet(TaskSet taskSet) {

        TaskSet t =taskSetRepository.save(taskSet);
return  t ;


    }

    @Override
    public Optional<TaskSet> findTaskSet(int id) {
        return taskSetRepository.findById(id);
    }

    @Override
    public List<TaskSet> getTaskSet() {

        List<TaskSet> taskSetList=taskSetRepository.findAll();
        return taskSetList;
    }

    @Override
    public Optional<TaskSet> getTaskSetById(int id) {
        Optional<TaskSet> taskSetList=taskSetRepository.findById(id);
        System.out.println(taskSetList);
        return taskSetList;
    }


}
