package com.springdemo.mcv.controller;


import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springdemo.mcv.model.Member;

import jakarta.validation.Valid;

public class MemberController {
    

    @GetMapping("/")
    public String showForm(Model theModel){
        
        theModel.addAttribute("member", new Member());

        return "member-form";
    }

    @PostMapping("/processForm")
    public String processForm(
        @Valid @ModelAttribute("member") Member theMember,
        BindingResult theBindingResult){

            if(theBindingResult.hasErrors()){
                return "member-form";
            }
            else{
                return "member-confirmation";
            }
        }
}
