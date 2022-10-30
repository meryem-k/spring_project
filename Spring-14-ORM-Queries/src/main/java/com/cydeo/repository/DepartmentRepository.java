package com.cydeo.repository;


import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {


    //Display all departments in the furniture department
    List<Department> findByDepartment(String department);

    //Display all departments in the health division
    List<Department> findByDivisionIs(String division);

    //Display top 3 departments with division name includes "Hea", without duplicates
    List<Department> findDistinctTop3ByDivisionContaining(String pattern);

    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department> getDepartmentDivision(List<String> division);


}
