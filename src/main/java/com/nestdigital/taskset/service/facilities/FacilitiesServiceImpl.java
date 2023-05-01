package com.nestdigital.taskset.service.facilities;

import com.nestdigital.taskset.model.facilities.Facilities;
import com.nestdigital.taskset.repository.facilities.FacilitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilitiesServiceImpl implements FacilitiesService{

    @Autowired
    FacilitiesRepository facilitiesRepository;
    @Override
    public Optional<Facilities> findFacility(int id) {
        return facilitiesRepository.findById(id);
    }

    @Override
    public List<Facilities> getFacilities() {
        List<Facilities> facilitiesList=facilitiesRepository.findAll();
        return facilitiesList;
    }

}
