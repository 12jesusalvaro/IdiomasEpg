package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "secretaries")
public class Secretary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "rol_id")
    private Rol rol;
}
