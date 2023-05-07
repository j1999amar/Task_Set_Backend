package com.nestdigital.taskset.service;

import com.nestdigital.taskset.model.dao.Facilities;

import java.util.Optional;

public interface FacilitiesService {

    Optional<Facilities> findFacility(int id);
}
