package com.nestdigital.taskset.repository.units;

import com.nestdigital.taskset.model.units.Units;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UnitsRepository extends JpaRepository<Units,Integer> {
}
