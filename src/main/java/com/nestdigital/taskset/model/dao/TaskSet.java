package com.nestdigital.taskset.model.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "taskset")
public class TaskSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    @ManyToOne()
    @JoinColumn(name = "unit_id")
    private Units unit;

    @ManyToOne()
    @JoinColumn(name = "event_type_id")
    private EventType eventType;

    @ManyToOne()
    @JoinColumn(name = "facility_id")
    private Facilities facilities;

    private boolean applyToAll = false;

    private boolean isdeleted = false;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "taskset_task", joinColumns = @JoinColumn(name = "taskset_id "), inverseJoinColumns = @JoinColumn(name = "task_id"))
    private Set<Tasks> tasks;


}


