package com.nestdigital.taskset.controller.units;

import com.nestdigital.taskset.model.units.Units;
import com.nestdigital.taskset.service.units.UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnitsController {

    @Autowired
    UnitsService unitsService;

    @GetMapping(value = "/getUnits")
    private List<Units>  getUnits(){
        List<Units> unitsList=unitsService.getUnits();
        return unitsList;
    }
}
