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

import com.nt.entity.Employee;
import com.nt.service.EmpService;

@RestController
public class HomeController {

	@Autowired
	EmpService service;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello world!";
	}
	
	@GetMapping("/all")
	public List<Employee> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/emp/id/{id}")
	@ResponseBody 
	public Employee getEmpById(@PathVariable("id") String id) {
		return service.getByID(id);
		
	}
	

	@PostMapping("/add")
	public String postEmployee(@RequestBody Employee emp ) {
	System.out.println(emp.getDepartment().getId());	
	service.add(emp);
		return "OK";
	}
	
	

    @PutMapping("/update")
    public Employee putEmployee(@RequestBody Employee emp) {
        return service.update(emp);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(@RequestParam("id") String id) {
        service.delete(id);
    }
}
