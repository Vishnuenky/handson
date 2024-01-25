package com.program.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class EmpInCity {
	
	public static void main(String[] args) {
	
	List<Employee> l = new ArrayList<Employee>();
	createEmp(l);
	
	//grouping employee by City
	Map<String,List<Employee>> ll = l.stream().collect(Collectors.groupingBy(Employee::getCity));
	System.out.println(ll);
	
	//print distinct city
	l.stream().map(Employee::getCity).distinct().forEach(System.out::println);;
	//Count of employee working in each city
	Map<String,Long> ml =l.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.counting()));
	System.out.println(ml);
	
	//averaging of "SE" and "IT"
		Map<String,Double> al =l.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.averagingDouble(Employee::getId)));
		System.out.println(al);
	
	//Employee's highest id in each city
	Map<String,List<Employee>> l3 = l.stream().collect(Collectors.groupingBy(Employee::getCity));
	//incomplete
	
	
	//print employee who is in "SE" and id greater than or equal to 3
	List<Employee> l2=l.stream().filter(e->e.getCity().equalsIgnoreCase("SE")).filter(a->a.getId()>=3).collect(Collectors.toList());
	l2.stream().forEach(System.out::println);
	l2.stream().forEach(e->System.out.println(e));
	
	System.out.println("**********");
	List<Employee> l31=l.stream().filter(e->e.getCity().equalsIgnoreCase("SE") && e.getId()>=3).collect(Collectors.toList());
	l31.stream().forEach(System.out::println);
	l31.stream().forEach(e->System.out.println(e));
	
	}
	
	
	
	private static void createEmp(List<Employee> l){
		Employee e1 = new Employee("dd","SE",4);
		Employee e2 = new Employee("vd","SE",3);
		Employee e3 = new Employee("fd","IT",6);
		Employee e4 = new Employee("fd","IT",10);
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		
	}
	

	
	

}
