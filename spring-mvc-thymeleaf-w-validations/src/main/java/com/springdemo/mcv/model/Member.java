package com.springdemo.mcv.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Member {
    
    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is requried")
    private String lastName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is requried")
    private String email;

    @NotNull(message = "is required")
    @Min(value=0, message = "must be greater than or equal to zero")
    @Max(value=10, message = "must be less than or equal to 10")
    private Integer fitnessGoal;

    // using regular expression for validaiton 
    @Pattern(regexp = "^GYM[0-9]{5}", message = "Membership ID must start with 'GYM' and exactly 5 digits") 
    private String membershipId;

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

    public Integer getFitnessGoal(){
        return fitnessGoal;
    }

    public void setFitnessGoal(Integer fitnessGoal){
        this.fitnessGoal = fitnessGoal;
    }

    public String getMembershipId(){
        return membershipId;
    }

    public void setMembershipId(String membershipId){
        this.membershipId = membershipId;
    }

}
