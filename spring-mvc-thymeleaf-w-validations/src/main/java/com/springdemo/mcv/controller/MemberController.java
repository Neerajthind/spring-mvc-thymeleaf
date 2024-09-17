package com.springdemo.mcv.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springdemo.mcv.model.Member;

import jakarta.validation.Valid;

public class MemberController {
    

    @GetMapping("/")
    public String showForm(Model theModel){
        
        theModel.addAttribute("customer", new Member());

        return "member-form";
    }

    @PostMapping("/processForm")
    public String processForm(
        
    )
}
