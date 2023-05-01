package com.nestdigital.taskset.model.eventType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nestdigital.taskset.model.taskSet.TaskSet;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "event_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "event_type_name")
    private String eventType;

    @JsonBackReference
    @OneToMany(mappedBy = "eventType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TaskSet> taskSets = new ArrayList<>();
}



