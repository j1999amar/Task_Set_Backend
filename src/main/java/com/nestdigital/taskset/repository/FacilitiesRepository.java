package com.nestdigital.taskset.repository;

import com.nestdigital.taskset.model.dao.Facilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilitiesRepository extends JpaRepository<Facilities,Integer> {
}
