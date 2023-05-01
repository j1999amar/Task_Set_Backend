package com.nestdigital.taskset.repository.eventType;

import com.nestdigital.taskset.model.eventType.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepository extends JpaRepository<EventType,Integer> {
}
