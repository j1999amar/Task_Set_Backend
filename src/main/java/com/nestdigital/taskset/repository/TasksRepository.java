package com.nestdigital.taskset.repository;

import com.nestdigital.taskset.model.dao.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<Tasks,Integer> {
}