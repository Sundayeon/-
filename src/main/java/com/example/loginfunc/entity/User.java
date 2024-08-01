package com.example.loginfunc.entity;

import com.example.loginfunc.dto.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentNumber;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false)
    private int grade;

    @Column(nullable = false, length = 200)
    private String track1;

    @Column(nullable = false, length = 200)
    private String track2;

    @Column(nullable = false, length = 20)
    private String state;

    public static User fromUserDTO(UserDTO userDTO){
        return User.builder()
                .studentNumber(userDTO.getStudentNumber())
                .password(userDTO.getPassword())
                .name(userDTO.getName())
                .grade(userDTO.getGrade())
                .track1(userDTO.getTrack1())
                .track2(userDTO.getTrack2())
                .state(userDTO.getState())
                .build();
    }

}