package com.nt.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Department;
import com.nt.service.EmpDptService;

@RestController
public class DepartmentController {

	@Autowired
	EmpDptService serviceDpt;
	
	@GetMapping("/hi")
	public String sayHello() {
		return "hello department!";
	}
	
	@GetMapping("/allDpt")
	public List<Department> getAll(){
		return serviceDpt.getAll();
	}
	
	@GetMapping("/dpt/id/{id}")
	@ResponseBody 
	public Department getDptById(@PathVariable("id") long id) {
		return serviceDpt.getByID(id);
		
	}
	

	@PostMapping("/addDpt")
	public String postDepartment(@RequestBody Department dpt ) {
	System.out.println(dpt.getDptName());	
	serviceDpt.add(dpt);
		return "Success";
	}
	
	

    @PutMapping("/updateDpt")
    public Department putDepartment(@RequestBody Department dpt) {
        return serviceDpt.update(dpt);
    }

    @DeleteMapping("/deleteDpt")
    public void deleteDepartment(@RequestParam("id") long id) {
        serviceDpt.delete(id);
    }

	
	
    
}