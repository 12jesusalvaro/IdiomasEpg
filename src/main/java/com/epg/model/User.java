
package com.epg.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String names;

    @Column(length = 10, unique = true)
    private String epg_code;

    @Column(length = 50)
    private String f_last_name;

    @Column(length = 50)
    private String s_last_name;
    private Integer age;

    @Column(length = 15)
    private String phone_number;

    @Column(length = 255)
    private String email;


    private String password;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Student student;

}
