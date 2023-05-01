package com.nestdigital.taskset.model.facilities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nestdigital.taskset.model.taskSet.TaskSet;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "facility")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facilities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "facility_name")
    private String facility;

    @JsonBackReference
    @OneToMany(mappedBy = "facilities", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TaskSet> taskSets = new ArrayList<>();
}

