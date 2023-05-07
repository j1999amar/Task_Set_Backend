package com.nestdigital.taskset.service.impl;

import com.nestdigital.taskset.model.dao.Units;
import com.nestdigital.taskset.repository.UnitsRepository;
import com.nestdigital.taskset.service.UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UnitsServiceImpl implements UnitsService {
    @Autowired
    UnitsRepository unitsRepository;
    @Override
    public Optional<Units> findUnits(int id) {

        return unitsRepository.findById(id);
    }


}
