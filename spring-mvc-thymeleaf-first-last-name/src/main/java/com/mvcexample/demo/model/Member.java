package com.mvcexample.demo.model;

public class Member {

    // define our data types

    private String firstName; 
    private String lastName;
    private String email;


    // define constructor
    public Member(){

    }

    // setters and getters 
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
