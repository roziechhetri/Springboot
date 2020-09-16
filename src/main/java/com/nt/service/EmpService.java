package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface EmpService {
	Employee getByID(String id);

	List<Employee> getAll();

	public	Employee add(Employee emp);

	public	Employee update(Employee emp);

	public void delete(String id);

	public void save(Employee emp);

}

/*

 public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

*/