package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    //Display all employees with email address ' '
    List<Employee> findByEmailIs(String email);

    //Display all employees with first name ' ' and last name ' ', also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display all employees that first name is not ' '
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with ' '
    List<Employee> findByLastNameStartingWith(String prefix);

    //Display all employees with salaries higher than ' '
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ' '
    List<Employee> findBySalaryLessThanEqual(Integer salary);


    //Display all employees that has been hired between dates '' and  ''
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);


    //Display all employees where salaries are greater and equal to '' in order
    List<Employee> findBySalaryIsGreaterThanEqualBOrderBySalaryDesc(Integer salary);

    //Display top unique 3 employees that is making less than ' '
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    //execute method and retrieve employee object
    @Query("SELECT e FROM Employee e Where e.email = 'sdubber7@t-online.de'")
    Employee getEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e where e.email='sdubber7@t-online.de'")
    Integer getEmployeeSalary();

    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("SELECT e FROM Employee e WHERE e.email=?1 AND e.salary=?2")
    Employee getEmployeeDetail(String email,int salary);





}
