package com.nestdigital.taskset.service.taskSet;

import com.nestdigital.taskset.dto.TaskSetDTO;
import com.nestdigital.taskset.dto.UnitsEventsFacilityDto;
import com.nestdigital.taskset.model.taskSet.TaskSet;
import com.nestdigital.taskset.repository.eventType.EventTypeRepository;
import com.nestdigital.taskset.repository.facilities.FacilitiesRepository;
import com.nestdigital.taskset.repository.taskSet.TaskSetRepository;
import com.nestdigital.taskset.repository.tasks.TasksRepository;
import com.nestdigital.taskset.repository.units.UnitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class TaskSetServiceImpl implements TaskSetService {
    @Autowired
    TaskSetRepository taskSetRepository;

    @Autowired
    EventTypeRepository eventTypeRepository;

    @Autowired
    UnitsRepository unitsRepository;

    @Autowired
    FacilitiesRepository facilitiesRepository;

    @Autowired
    TasksRepository tasksRepository;


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

    @Override
    public UnitsEventsFacilityDto getUnitsEventsFacilityList(TaskSet taskSet) {
        UnitsEventsFacilityDto taskSetDTO = new UnitsEventsFacilityDto();
        taskSetDTO.setEventType(eventTypeRepository.findAll());

        taskSetDTO.setUnit(unitsRepository.findAll());

        taskSetDTO.setFacilities(facilitiesRepository.findAll());


        taskSetDTO.setTasks(tasksRepository.findAll());


        return taskSetDTO;
    }



    @Override
    public List<TaskSetDTO> getTaskSetAllList() {
        List<TaskSetDTO> taskSetDTO = new ArrayList<>();
        taskSetDTO=taskSetRepository.findAll().stream().map(taskSet -> new TaskSetDTO(taskSet.getId(),
                taskSet.getName(),
                taskSet.getDescription(),
                taskSet.getUnit(),
                taskSet.getEventType(),
                taskSet.getFacilities(),
                taskSet.isApplyToAll(),
                taskSet.isIsdeleted(),
                taskSet.getTasks())).collect(Collectors.toList());

        for(TaskSetDTO dto : taskSetDTO){
            if(dto.isIsdeleted()==true)
            taskSetDTO.remove(dto);
        }

        return taskSetDTO;
    }


}
