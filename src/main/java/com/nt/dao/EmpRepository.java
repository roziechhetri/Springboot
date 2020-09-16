package com.nt.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee,String>{

	Optional<Employee> findById(String l);

	void deleteById(String id);

	

}
