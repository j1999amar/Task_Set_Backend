package com.nestdigital.taskset.controller;

import com.nestdigital.taskset.model.dao.*;
import com.nestdigital.taskset.model.dto.TaskSetDTO;
import com.nestdigital.taskset.model.dto.UnitsEventsFacilityDto;
import com.nestdigital.taskset.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class TaskSetController {
    @Autowired
    TaskSetService taskSetService;

    @Autowired
    EventTypeService eventTypeService;

    @Autowired
    FacilitiesService facilitiesService;
    @Autowired
    UnitsService unitsService;
    @Autowired
    TasksService tasksService;

    @CrossOrigin("*")
    @PutMapping(value = "/{id}", consumes = "application/json")
    public String updateTaskSet(@PathVariable int id, @RequestBody TaskSet taskSet) {


        Optional<TaskSet> taskSet1 = taskSetService.findTaskSet(taskSet.getId());
        Optional<Units> units = unitsService.findUnits(taskSet.getUnit().getId());
        Optional<EventType> eventType = eventTypeService.findEventType(taskSet.getEventType().getId());
        Optional<Facilities> facilities = facilitiesService.findFacility(taskSet.getFacilities().getId());
        List<Tasks> taskList=tasksService.findAllTask();

        for (Tasks t : taskSet.getTasks()) {
            Optional<Tasks>task = tasksService.findTask(t.getId());
        }


        if (taskSet1.isEmpty()|| taskSet1==null) {
            return "invalid task set  ";

        } else if (units.isEmpty()|| units==null) {
            return "invalid units  ";

        } else if (eventType.isEmpty()|| eventType==null) {
            {
                return "invalid event type  ";
            }
        } else if (facilities.isEmpty()|| facilities==null) {
            {
                return "invalid facility type  ";
            }
        } else if (taskList.isEmpty() || taskList==null) {
            return "invaild task ";
        } else {
            taskSetService.updateTaskSet(taskSet);
        }

        return "{\"status\":\"success\"}";
    }

    @CrossOrigin("*")
    @GetMapping("/getTaskSetList")
    List<TaskSetDTO> getTaskSet(TaskSet taskSet){
        return taskSetService.getTaskSetAllList();
    }
    @CrossOrigin("*")
    @GetMapping("/getAllFieldList")
    UnitsEventsFacilityDto getTaskSetList(TaskSet taskSet){
        return taskSetService.getUnitsEventsFacilityList(taskSet);
    }


    @PostMapping("/deleteTaskSet/{id}")
    String deleteTaskSet(@PathVariable int id){
        return taskSetService.deleteTaskSet(id);
    }
}
