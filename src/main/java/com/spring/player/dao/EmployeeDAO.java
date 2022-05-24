package com.spring.player.dao;


import com.spring.player.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeDAO extends JpaRepository<Employee, Integer> {


		
}
