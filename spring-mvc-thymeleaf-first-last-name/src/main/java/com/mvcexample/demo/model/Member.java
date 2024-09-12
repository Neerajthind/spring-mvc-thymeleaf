package com.mvcexample.demo.model;

public class Member {

    // define our data types

    private String firstName; 
    private String lastName;
    private String email;
    private String contactMethod;
    private String subPlan;


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

    public String getContactMethod(){
        return contactMethod;
    }

    public void setContactMethod(String contactMethod){
        this.contactMethod = contactMethod;
    }

    public String getSubPlan(){
        return subPlan;
    }

    public void setSubPlan(String subPlan){
        this.subPlan = subPlan;
    }
}
