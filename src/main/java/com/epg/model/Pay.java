package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "pays")
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false)
    private Student student;

    private String serie;
    private String sequence;
    private BigDecimal amount;
    private LocalDate pay_date;
    private String pay_number;
    private String voucher;
}
