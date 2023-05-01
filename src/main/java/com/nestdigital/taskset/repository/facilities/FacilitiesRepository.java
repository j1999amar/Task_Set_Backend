package com.nestdigital.taskset.repository.facilities;

import com.nestdigital.taskset.model.facilities.Facilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilitiesRepository extends JpaRepository<Facilities,Integer> {
}
