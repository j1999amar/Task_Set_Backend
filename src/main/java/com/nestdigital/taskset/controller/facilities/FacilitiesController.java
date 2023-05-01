package com.nestdigital.taskset.controller.facilities;

import com.nestdigital.taskset.model.facilities.Facilities;
import com.nestdigital.taskset.service.facilities.FacilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FacilitiesController {

    @Autowired
    FacilitiesService facilitiesService;

    @GetMapping(value = "/getFacilities")
    private List<Facilities>  getFacilities(){
        List<Facilities> facilitiesList=facilitiesService.getFacilities();
        return facilitiesList;
    }
}
