package com.epg.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
@Table(name = "class_schedules")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClassSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalTime start_time;
    private LocalTime end_time;
    private Boolean active;
    private LocalDate start_date;

    @OneToMany(mappedBy = "classSchedule", cascade = CascadeType.MERGE)
    private List<Group> groups;
}
