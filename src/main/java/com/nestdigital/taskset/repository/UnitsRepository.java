package com.nestdigital.taskset.repository;

import com.nestdigital.taskset.model.dao.Units;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UnitsRepository extends JpaRepository<Units,Integer> {
}
