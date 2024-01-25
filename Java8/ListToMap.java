package com.program.Java8;
import java.util.*;
import java.util.stream.Collectors;
public class ListToMap {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		
		createEmpList(emp);
		Map<String,List<Employee>> empMap= emp.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println(empMap);
		
		//or
		empMap.forEach((k,v)->System.out.println(k+"********"+v));
		empMap.forEach((k,v)->System.out.println(k));
	}

	private static void createEmpList(List<Employee> emp) {
		Employee e1= new Employee();
		e1.setName("vinu");
		e1.setCity("Delhi");
		e1.setId(1);
		
		Employee e2= new Employee();
		e2.setName("vinu");
		e2.setCity("Delhi");
		e2.setId(3);
		
		emp.add(e1);
		emp.add(e2);
	}

}
