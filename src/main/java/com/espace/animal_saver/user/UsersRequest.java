package com.espace.animal_saver.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.UUID;

@Getter
@Setter
@ToString
public class UsersRequest {
    private String username;
    private String password;
    private String email;
    private String name;
    private UUID uuid;
}
