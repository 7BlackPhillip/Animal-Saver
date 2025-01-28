package com.espace.animal_saver.user;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UsersRestController {
    // Creat
    // Read
    // Update
    // Delete

    private final UsersRepository repository;
    private final ModelMapper modelMapper;

    UsersRestController(UsersRepository repository, ModelMapper modelMapper){
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    private UsersResponse convertResponse(Users users) {
        return this.modelMapper.map(users, UsersResponse.class);
    }

    private Users convertRequest(UsersRequest request) {
        return this.modelMapper.map(request, Users.class);
    }

    @GetMapping
    public List<UsersResponse> getAllUsers(){
        return this.repository.findAll().stream()
                .map(this::convertResponse)
                .toList();
    }

    @GetMapping("/{uuid}")
    public UsersResponse getUserById(@PathVariable UUID uuid){
         return this.repository.findByUuid(uuid)
                 .map(this::convertResponse)
                 .orElseThrow();
    }


    @PostMapping
    public UsersResponse createUser(@RequestBody UsersRequest request){
        Users user = convertRequest(request);
        Users novoUser = this.repository.save(user);
        return this.convertResponse(novoUser);
    }

    @DeleteMapping("/{uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(UUID uuid){
        Users user = this.repository.findByUuid(uuid).orElseThrow();
        this.repository.delete(user);
    }
}
