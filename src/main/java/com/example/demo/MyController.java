package com.example.demo;

import java.util.*;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/")
	
	public static List<Employee> getEmployees() {
		ArrayList<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(2, "keshav", "yeduru", "keshav.aero0552@gmail.com"));
		employeesList.add(new Employee(3, "chenna", "kesava", "keshavreddy1988@gmail.com"));
		employeesList.add(new Employee(1, "yeduru", "kesava", "chennakesava231@gmail.com"));
		return employeesList;
	}
		
	public static void displayEmployes(List<Employee> employeeList)
	{
		Iterator<Employee> employeedetails = employeeList.iterator();
		while(employeedetails.hasNext())
		{
			Employee e = employeedetails.next();
			System.out.println(e);
		}
	}
	
//	public static void main(String[] args) {
//		List<Employee> employeeslist= getEmployees();
//		System.out.println("without sorting");
//		displayEmployes(employeeslist);
//		Collections.sort(employeeslist);
//		System.out.println("after sorting");
//		displayEmployes(employeeslist);
//		
//	
//
//	}

}
