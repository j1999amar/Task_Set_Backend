package com.nestdigital.taskset.controller.tasks;

import com.nestdigital.taskset.model.tasks.Tasks;
import com.nestdigital.taskset.service.tasks.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TasksController {

    @Autowired
    TasksService tasksService;

    @GetMapping(value = "/getTasks")
    private List<Tasks>  getTasks(){
        System.out.println("inside");
        List<Tasks> tasksList=tasksService.getTasks();
        System.out.println(tasksList);
        return tasksList;
    }

    @GetMapping(value = "/getTasksById/{id}")
    private List<Tasks>  getTasksById(@PathVariable int id){
        List<Tasks> tasksList=tasksService.getTasksById( id);
        return tasksList;
    }


}
