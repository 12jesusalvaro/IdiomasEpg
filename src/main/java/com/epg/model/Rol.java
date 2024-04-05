package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "rols")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Boolean active;

    @OneToMany(mappedBy = "rol")
    private List<Student> students;

    @OneToMany(mappedBy = "rol")
    private List<Secretary> secretaries;

    @OneToMany(mappedBy = "rol")
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "rol")
    private List<Admin> admins;

    @OneToMany(mappedBy = "rol")
    private List<Director> directors;

}
