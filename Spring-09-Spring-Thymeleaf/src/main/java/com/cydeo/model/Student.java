package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data//generates only no arg constructor
@AllArgsConstructor

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String state;

}
