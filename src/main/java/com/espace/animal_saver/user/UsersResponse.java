package com.espace.animal_saver.user;


import lombok.*;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UsersResponse {

    private UUID uuid;
    private String username;
    private String password;
    private String email;
    private String name;

}
