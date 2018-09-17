package com.septjpademo.septjpademo.repos;

import com.septjpademo.septjpademo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by abhi on 16/09/18.
 */


public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
