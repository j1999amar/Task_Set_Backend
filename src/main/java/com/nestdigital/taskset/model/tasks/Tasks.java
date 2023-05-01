package com.nestdigital.taskset.model.tasks;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nestdigital.taskset.model.taskSet.TaskSet;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "task")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "task_name")
    private String taskname;

    @JsonBackReference
    @ManyToMany(mappedBy = "tasks")
    private Set<TaskSet> taskSets_task = new HashSet<>();


}
