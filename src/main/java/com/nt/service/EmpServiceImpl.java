package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmpRepository;
import com.nt.entity.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRepository empRepo;

	@Override
	public Employee getByID(String id) {
		
		return empRepo.findById(id).get();
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> list = new ArrayList<Employee>();
		Iterable<Employee> itr = empRepo.findAll();
		for (Employee emp : itr)
			list.add(emp);
		return list ;
	}

	@Override
	public Employee add(Employee emp) {
		return empRepo.save(emp);//insert or update
	}


	@Override
	public Employee update(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public void delete(String id) {
		 empRepo.deleteById(id);
		
	}

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}
