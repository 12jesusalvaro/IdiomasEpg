package com.epg.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name="languages")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal totalCost;
    private Boolean active;
    private String curricular_structure;

    @OneToMany(mappedBy = "language", cascade = CascadeType.ALL)
    private List<Group> groups;

}
