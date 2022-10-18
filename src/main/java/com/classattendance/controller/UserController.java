package com.classattendance.controller;

import com.classattendance.domain.User;
import com.classattendance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/ClassAttendance")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("students")
    public List<User> getAllStudents(){
        return new ArrayList<>(repository.findAll());
    }

    @GetMapping("{groupId}/students")
    public List<User> getStudentsByGroup(@PathVariable String groupId){
        return new ArrayList<>(repository.findByGroupId(groupId));
    }

    @GetMapping("groups")
    public List<String> getGroups(){
        return new ArrayList<>(repository.findDistinctByGroupId());
    }
}