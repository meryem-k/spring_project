package com.cydeo.controller;

import com.cydeo.boostrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")//end point will start with student
public class StudentController {

  /*  @RequestMapping("/register", method = RequestMethod.GET )//localhost:8080/student/register
    public String register(){

        return "student/register";//return this method to the view (where is that view? it is under the student folder in the register html)
        //Spring boot will look for that html inside the resources folder either inside the static folder or template folder.
        // It will look under static folder if there is no changes/ data binding needed for that html.
    }
*/


    //Transfer data to view with Model Interface
    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());//attribute name is holding student list and we can use this attribute name in the view.
        return "student/register";
    }

    @GetMapping("/welcome")
    public String info(){

        return "student/welcome";
    }

}
