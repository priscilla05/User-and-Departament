package com.devapi.userdepart.repositories;

import com.devapi.userdepart.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
