package com.emsusingsboot.emsusingsboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmsController {
	@Autowired
	EmsService emp;
	
	@GetMapping ("/allEmp")
	public List<Employee> empList()
	{
		return emp.getEmpList();
	}

}
