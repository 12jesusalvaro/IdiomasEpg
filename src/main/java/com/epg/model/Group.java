package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "language_id", referencedColumnName = "id", nullable = false)
    private Language language;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "class_schedule_id", referencedColumnName = "id", nullable = false)
    private ClassSchedule classSchedule;

    private Integer cant_minimum_est;
    private Boolean active;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

    @OneToOne(mappedBy = "group", cascade = CascadeType.ALL)
    private Book book;
}
