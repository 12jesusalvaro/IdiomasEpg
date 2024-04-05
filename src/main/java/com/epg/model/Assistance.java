package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "assistances")
public class Assistance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "inscription_id", referencedColumnName = "id", nullable = false)
    private Inscription inscription;

    private Integer total_attendance;
    private Integer attendance_number;
}
