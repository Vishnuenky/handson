package com.program.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class EmpGreater2 {

	public static void main(String[] args) {
		
		List<Employee> empl = new ArrayList<Employee>();
		createEmpSort(empl);
		
		List<Employee> lo =empl.stream().filter(e->e.getId()>2).collect(Collectors.toList());
		System.out.println(lo);//here we need toString() method to be overrided to print object inside list
		
		lo.stream().forEach(e->System.out.println(e.getName()+""+e.getCity()+""+e.getId()));
		
		
		empl.stream().filter(e->e.getId()>2).forEach(e->System.out.println("*********"+e.getName()));
		List<String> ee = empl.stream().filter(e->e.getId()>2).map(Employee::getName).collect(Collectors.toList());
		System.out.println(ee);
		
		
		System.out.println("****Employee Name alone to print  who is in DELHI by using method reference and collecting it in list********");
		List<String> l11 = empl.stream().filter(e->e.getCity().equalsIgnoreCase("delhi")).map(Employee::getName).collect(Collectors.toList());//we can also use equals()
		System.out.println(l11);
		
		
		System.out.println("****Employee who is in DELHI & id less than 3********");
		List<Employee> l1 = empl.stream().filter(e->e.getCity().equalsIgnoreCase("delhi") && e.getId()<3).collect(Collectors.toList());//we can also use equals()
		l1.stream().forEach(e->System.out.println(e.getName()+e.getCity()+e.getId()));
		
		System.out.println("****Employee Average of id ********");
		
		Double res =  empl.stream().filter(e->e.getCity().equals("Delhi")).collect(Collectors.averagingDouble(Employee::getId));
		System.out.println(res);
		
		Double res1 =  empl.stream().collect(Collectors.averagingDouble(Employee::getId));
		System.out.println(res1);
	}
		private static void createEmpSort(List<Employee> empl) {
			//Employee e1= new Employee("ddd","delhi",3); --if we are initializing the value using parameterized constructor ,we can use this
			Employee e1= new Employee();
			e1.setName("dd");
			e1.setCity("Delhi");
			e1.setId(4);
			
			Employee e2= new Employee();
			e2.setName("vinu");
			e2.setCity("chennai");
			e2.setId(3);
			
			Employee e3= new Employee();
			e3.setName("vinu");
			e3.setCity("Delhi");
			e3.setId(2);
			
			empl.add(e1);
			empl.add(e2);
			empl.add(e3);
		}

	

}
