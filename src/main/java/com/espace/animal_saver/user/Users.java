package com.espace.animal_saver.user;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "user")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;
    @Column(unique = true)
    private String username;
    private String password;
    private String email;
    private String name;

    /*public UsersResponse toResponse(){
        UsersResponse response =
    }*/



}
