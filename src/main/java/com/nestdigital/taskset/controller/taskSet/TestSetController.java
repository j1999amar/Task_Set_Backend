package com.nestdigital.taskset.controller.taskSet;

import com.nestdigital.taskset.model.eventType.EventType;
import com.nestdigital.taskset.model.facilities.Facilities;
import com.nestdigital.taskset.model.taskSet.TaskSet;
import com.nestdigital.taskset.model.tasks.Tasks;
import com.nestdigital.taskset.model.units.Units;
import com.nestdigital.taskset.service.eventType.EventTypeService;
import com.nestdigital.taskset.service.facilities.FacilitiesService;
import com.nestdigital.taskset.service.taskSet.TaskSetService;
import com.nestdigital.taskset.service.tasks.TasksService;
import com.nestdigital.taskset.service.units.UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TestSetController {
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

    @PutMapping(value = "/{id}", consumes = "application/json")
    public String updateTaskSet(@PathVariable int id, @RequestBody TaskSet taskSet) {


        Optional<TaskSet> taskSet1 = taskSetService.findTaskSet(taskSet.getId());
        Optional<Units> units = unitsService.findUnits(taskSet.getUnit().getId());
        Optional<EventType> eventType = eventTypeService.findEventType(taskSet.getEventType().getId());
        Optional<Facilities> facilities = facilitiesService.findFacility(taskSet.getFacilities().getId());
        Optional<Tasks> taskList = null;

        for (Tasks t : taskSet.getTasks()) {
            taskList = tasksService.findTask(t.getId());
        }


        if (taskSet1.isEmpty()) {
            return "invalid task set  ";

        } else if (units.isEmpty()) {
            return "invalid units  ";

        } else if (eventType.isEmpty()) {
            {
                return "invalid event type  ";
            }
        } else if (facilities.isEmpty()) {
            {
                return "invalid facility type  ";
            }
        } else if (taskList.isEmpty()) {
            return "invaild task ";
        } else {
            taskSetService.updateTaskSet(taskSet);
        }

        return "success";
    }

    @GetMapping("/getTaskSet")
    List<TaskSet> getTaskSet(){
        List<TaskSet> taskSetList=taskSetService.getTaskSet();
        return taskSetList;
    }

    @PostMapping("/getTaskSetById/{id}")
    Optional<TaskSet> getTaskSetById(@PathVariable int id){
        Optional<TaskSet> taskSetList=taskSetService.getTaskSetById(id);
        return taskSetList ;
    }
    @PostMapping("/deleteTaskSet/{id}")
    String deleteTaskSet(@PathVariable int id){
        return taskSetService.deleteTaskSet(id);
    }
}