package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "inscription_id", referencedColumnName = "id", nullable = false)
    private Inscription inscription;

    private BigDecimal note_1;
    private BigDecimal note_2;
    private BigDecimal note_3;
    private BigDecimal end_note;
}
