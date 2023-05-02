package com.nestdigital.taskset.repository.taskSet;

import com.nestdigital.taskset.model.taskSet.TaskSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskSetRepository extends JpaRepository<TaskSet, Integer> {



}
