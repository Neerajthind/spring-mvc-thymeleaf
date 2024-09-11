package com.mvcexample.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvcexample.demo.model.Member;

@Controller
public class MemberController {
    
    @GetMapping("/form")
    public String showForm(Model theModel){

        // creating a new member object 
        Member theMember = new Member();

        // add the member object to the model
        theModel.addAttribute("member", theMember);

        return "member-form";

    }

    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("member") Member theMember){
        
        // want the information to be printed out in the terminal just to make sure
        System.out.println("Member: " + theMember.getFirstName() + ' ' + theMember.getLastName());
        System.out.println("Member Email: " + theMember.getEmail());

        return "member-confirmation";
    }

}
