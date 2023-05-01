package com.nestdigital.taskset.service.units;

import com.nestdigital.taskset.model.units.Units;
import com.nestdigital.taskset.repository.units.UnitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitsServiceImpl implements UnitsService {
    @Autowired
    UnitsRepository unitsRepository;
    @Override
    public Optional<Units> findUnits(int id) {

        return unitsRepository.findById(id);
    }

    @Override
    public List<Units> getUnits() {
        List<Units> unitsList=unitsRepository.findAll();
        return unitsList;
    }
}
