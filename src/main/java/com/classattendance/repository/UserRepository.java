package com.classattendance.repository;

import com.classattendance.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByFirstName(String firstName);
    public List<User>findByGroupId(String groupId);

    public List<String>findDistinctByGroupId();

}