package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "rol_id", referencedColumnName = "id")
    private Rol rol;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Pay pay;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;
}
