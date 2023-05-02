package com.nestdigital.taskset.service.taskSet;

import com.nestdigital.taskset.model.taskSet.TaskSet;
import com.nestdigital.taskset.repository.taskSet.TaskSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@Service
public class TaskSetServiceImpl implements TaskSetService {
    @Autowired
    TaskSetRepository taskSetRepository;

    @Override
    public TaskSet updateTaskSet(TaskSet taskSet) {

        TaskSet t = taskSetRepository.save(taskSet);
        return t;


    }

    @Override
    public Optional<TaskSet> findTaskSet(int id) {
        return taskSetRepository.findById(id);
    }

    @Override
    public List<TaskSet> getTaskSet() {

        List<TaskSet> taskSetList = taskSetRepository.findAll();
        Iterator<TaskSet> iterator = taskSetList.iterator();
        while (iterator.hasNext()) {
            TaskSet taskSet = iterator.next();
            if (taskSet.isIsdeleted()) {
                iterator.remove();
            }

        }
        return taskSetList;
    }

    @Override
    public Optional<TaskSet> getTaskSetById(int id) {
        Optional<TaskSet> taskSetList = taskSetRepository.findById(id);
        System.out.println(taskSetList);
        return taskSetList;
    }

    @Override
    public String deleteTaskSet(int id) {


        try {
            Optional<TaskSet> taskSet = taskSet = taskSetRepository.findById(id);
            if (!taskSet.get().isIsdeleted()) {
                taskSet.get().setIsdeleted(true);
                taskSetRepository.save(taskSet.get());
                return "Record Deleted";
            } else {
                return "Invalid delete operation";
            }

        } catch (Exception E) {
            return "No record found for this user ";

        }

    }

}
