package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "teacher_guides")
public class TeacherGuide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String file;
}
