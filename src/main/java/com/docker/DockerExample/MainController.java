package com.docker.DockerExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class MainController {

	@GetMapping(path = "/{id}", produces = "application/json")
	public Employee getEmployee(@PathVariable("id") int id) {
		Employee emp = new Employee();
		emp.setId(id); 
		emp.setAge(20 + id);
		emp.setName("Prasanth-" + id); 
		return emp;
	}
}
