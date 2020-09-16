package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmpDptRepo;
import com.nt.entity.Department;


@Service
public class EmpDptService {

	@Autowired
	EmpDptRepo dptRepo;
	
	public List<Department> getAll() {
		List<Department> list = new ArrayList<Department>();
		Iterable<Department> itr = dptRepo.findAll();
		for (Department dpt : itr)
			list.add(dpt);
		return list ;
	}

	public Department getByID(long id) {
		return dptRepo.findById(id).get();
	}
	
	
	public Department add(Department dpt) {
		System.out.print(dpt.getContactNo());
		return dptRepo.save(dpt);
	}

	public Department update(Department dpt) {
		return dptRepo.save(dpt);
	}

	public void delete(long id) {
		 dptRepo.deleteById(id);
		
	}
	public void save(Department dpt) {
		// TODO Auto-generated method stub
		
	}

}
