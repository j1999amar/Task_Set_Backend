package com.nestdigital.taskset.repository.tasks;

import com.nestdigital.taskset.model.tasks.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<Tasks,Integer> {
}
