
package com.epg.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String names;
    private String epg_code;
    private String f_last_name;
    private String s_last_name;
    private Integer age;
    private String phone_number;
    private String email;
    private String password;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Student student;

}
