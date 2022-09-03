package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/another")
public class AnotherController {

    @RequestMapping("/list")//localhost:8080/another/list
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();

        mentorList.add(new Mentor("Mike","Smith",25, Gender.MALE));
        mentorList.add(new Mentor("Emily","Johnson",22,Gender.FEMALE));
        mentorList.add(new Mentor("Tom","Walsh",65,Gender.MALE));

        model.addAttribute("mentor", mentorList);

        return "/mentor/mentor-list";
    }


}
