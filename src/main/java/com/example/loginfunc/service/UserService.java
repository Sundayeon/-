package com.example.loginfunc.service;

import com.example.loginfunc.entity.User;
import com.example.loginfunc.dto.UserDTO;
import com.example.loginfunc.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDTO getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(UserDTO::of).orElse(null);
    }

    public User authenticate(int studentNumber, String password) {
        Optional<User> user = userRepository.findByStudentNumber(studentNumber);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user.get();
        }
        return null;
    }
}