package com.example.loginfunc.dto;

import com.example.loginfunc.entity.User;
import lombok.Data;

@Data
public class UserDTO {
    private int studentNumber;
    private String password;
    private String name;
    private int grade;
    private String track1;
    private String track2;
    private String state;

    static public UserDTO of(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setStudentNumber(user.getStudentNumber());
        userDTO.setPassword(user.getPassword());
        userDTO.setName(user.getName());
        userDTO.setGrade(user.getGrade());
        userDTO.setTrack1(user.getTrack1());
        userDTO.setTrack2(user.getTrack2());
        userDTO.setState(user.getState());
        return userDTO;
    }
}