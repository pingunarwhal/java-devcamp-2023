package com.adobe.devcamp.repository;

import com.adobe.devcamp.dto.UserDTO;
import com.adobe.devcamp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// done: - unmock this repository
//        - define some JPA queries
//        - what's Optional?

@Component
public interface UserRepository extends JpaRepository<User, String> { }
