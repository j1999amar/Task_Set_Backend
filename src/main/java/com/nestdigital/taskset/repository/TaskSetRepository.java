package com.nestdigital.taskset.repository;

import com.nestdigital.taskset.model.dao.TaskSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskSetRepository extends JpaRepository<TaskSet, Integer> {



}
