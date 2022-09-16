package com.cydeo.controller;


import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model){

        model.addAttribute("mentor", new Mentor());//create empty object first

        List<String> batchList = Arrays.asList("JD1","EU2","B11");

        model.addAttribute("batchList", batchList);

        return "/mentor/register";

    }

    @PostMapping("/confirm")
    public String showForm2(@ModelAttribute("mentor") Mentor mentor, Model model){//capture data from the previous method using the @ModelAttribute annotation

        System.out.println(mentor.toString());

        /*return "/mentor/mentor-confirmation";*/

        return "redirect:/mentor/register";//redirect->going from one end point method to another without going to another view
    }




}
