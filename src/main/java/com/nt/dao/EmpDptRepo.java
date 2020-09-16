package com.nt.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Department;


@Repository
public interface EmpDptRepo extends JpaRepository<Department, Long> {
	
	Optional<Department> findById(long id);

	void deleteById(long id);
	
	
	/*
	 @Repository
public interface OrderRepo extends JpaRepository<Order,Long>{
    @Query(value = "SELECT * FROM orders WHERE orders.customerid=?",nativeQuery = true)
    List<Order> Q1(int i); 
	 */
}
