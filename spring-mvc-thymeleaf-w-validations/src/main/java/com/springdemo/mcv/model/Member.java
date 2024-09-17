package com.springdemo.mcv.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Member {
    
    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is requried")
    private String lastName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is requried")
    private String email;

    public Member(){

    }

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
