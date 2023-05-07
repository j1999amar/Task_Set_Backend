package com.nestdigital.taskset.service;

import com.nestdigital.taskset.model.dao.Units;

import java.util.Optional;

public interface UnitsService {
    Optional<Units> findUnits (int id);

}
