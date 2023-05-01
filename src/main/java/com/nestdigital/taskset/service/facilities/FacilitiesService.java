package com.nestdigital.taskset.service.facilities;

import com.nestdigital.taskset.model.facilities.Facilities;

import java.util.List;
import java.util.Optional;

public interface FacilitiesService {

    Optional<Facilities> findFacility(int id);
    List<Facilities> getFacilities();
}
