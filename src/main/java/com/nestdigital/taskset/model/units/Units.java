package com.nestdigital.taskset.model.units;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nestdigital.taskset.model.taskSet.TaskSet;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table (name = "units")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Units {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "unit_name")
    private String unitName;

    @JsonBackReference
    @OneToMany(mappedBy = "unit", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TaskSet> taskSets = new ArrayList<>();


}
