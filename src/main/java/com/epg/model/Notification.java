package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String file;
    private String description;
}
