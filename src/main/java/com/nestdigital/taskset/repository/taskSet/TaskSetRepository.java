package com.nestdigital.taskset.repository.taskSet;

import com.nestdigital.taskset.model.taskSet.TaskSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskSetRepository extends JpaRepository<TaskSet, Integer> {


//    @Query(value = "SELECT t.id,t.name,t.description,t.event_type_id,t.facility_id,t.unit_id,t.apply_to_all,t.isdeleted,ts.task_id FROM taskset t JOIN taskset_task ts ON ts.taskset_id= 2 AND t.id=2;",nativeQuery = true)
//    List<TaskSet> getTasksById();
}
