package com.cydeo.repository;


import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {


    //find all courses by category
    List<Course> findByCategoryIs(String category);


    //find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //checks if a course with the provided name exists. Return true if exists, false otherwise
    Boolean existsByName(String name);

    //returns the count of courses for the provided category
    int countByCategory(String category);

    //find all courses that start with the provided course name
    List<Course> findByNameStartingWith(String name);

    //find all courses by category and returns stream
    Stream<Course> streamByCategory(String category);






}
