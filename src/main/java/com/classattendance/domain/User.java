package com.classattendance.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
@Document("students")
public class User {
    @Id
    String id;
    String firstName;
    String lastName;
    String email;
    String groupId;

    public User(){
    }

    public User(String id, String firstName, String lastName, String email, String groupId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.groupId = groupId;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId){
        this.groupId = groupId;
    }

    @Override
    public String toString(){
        return String.format("User[id=%s, firstName='%s', lastName='%s', email=%s, groupId=%s]",
                id, firstName, lastName, email, groupId);
    }
}
