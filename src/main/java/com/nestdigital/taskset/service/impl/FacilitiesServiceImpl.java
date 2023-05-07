package com.nestdigital.taskset.service.impl;

import com.nestdigital.taskset.model.dao.Facilities;
import com.nestdigital.taskset.repository.FacilitiesRepository;
import com.nestdigital.taskset.service.FacilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacilitiesServiceImpl implements FacilitiesService {

    @Autowired
    FacilitiesRepository facilitiesRepository;
    @Override
    public Optional<Facilities> findFacility(int id) {
        return facilitiesRepository.findById(id);
    }



}
