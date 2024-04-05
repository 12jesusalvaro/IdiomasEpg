package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inscriptions")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false)
    private Student student;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    private Group group;

    @OneToOne(mappedBy = "inscription", cascade = CascadeType.ALL)
    private Note note;

    @OneToOne(mappedBy = "inscription", cascade = CascadeType.ALL)
    private Assistance assistance;

}
