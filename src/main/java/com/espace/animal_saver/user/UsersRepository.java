package com.espace.animal_saver.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    // select * from Users where uuid = :param
    Optional<Users> findByUuid(UUID uuid);
}
