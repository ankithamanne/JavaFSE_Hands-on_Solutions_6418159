package com.example.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.ormlearn.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    // ✅ FIXED: Use exact field name from entity
    @Query("SELECT e FROM Employee e LEFT JOIN FETCH e.department LEFT JOIN FETCH e.skills")
    List<Employee> getAllPermanentEmployees();

    // ✅ Native query
    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    List<Employee> getAllEmployeesNative();
}
