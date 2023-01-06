package com.emsusingsboot.emsusingsboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmsService {
	private List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("Tim","101","HR"),
			new Employee("Jim","102","Dev")));


	public List<Employee> getEmpList()
	{
		return employees;
	}
}
