package com.nestdigital.taskset.service.units;

import com.nestdigital.taskset.model.units.Units;

import java.util.List;
import java.util.Optional;

public interface UnitsService {
    Optional<Units> findUnits (int id);
    List<Units> getUnits();

}
