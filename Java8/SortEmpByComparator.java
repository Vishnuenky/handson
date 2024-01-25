package com.program.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator; 

public class SortEmpByComparator {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		
		createEmpSort(emp);
		System.out.println("Ascending Order");
		List<Employee> newl = emp.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		newl.stream().forEach(System.out::println);
		
		System.out.println("**********************");
		System.out.println("Descending Order");
		Comparator<Employee> Namesort= Comparator.comparing(Employee::getName);
		//To get distinct value we need to override hashcode and equals method in Employee class
		List<Employee> newl2 = emp.stream().distinct().sorted(Namesort.reversed()).collect(Collectors.toList());
		
		newl2.stream().forEach(s->System.out.println(s));
		
		System.out.println("**********************");
		newl2.stream().forEach(s->System.out.println(s.getName()+" "+s.getId()+" "+s.getCity()+" "));
		
		
		Comparator<Employee> Namesort1= Comparator.comparing(Employee::getName);
		Comparator<Employee> Idsort= Comparator.comparing(Employee::getId);
		
		System.out.println("Multiple sorting Order");	
		emp.stream().sorted(Namesort1.thenComparing(Idsort)).collect(Collectors.toList()).forEach(System.out::println);
		//below line will sort name in descending and id also in descending
		System.out.println("**********");
		List<Employee> mull= emp.stream().sorted(Namesort1.reversed().thenComparing(Idsort).reversed()).collect(Collectors.toList()); 
		
		mull.stream().forEach(System.out::println);
		//mull.stream().forEach(mu->System.out.println(mu.getName()));
		//We can also do  like this but im getting error
		//Comparator<Employee> s = Comparator.comparing(Employee::getName).thenComparing(Employee::getid);//thenComparing(Employee::getId)).collect(Collectors.toList());
	}
		private static void createEmpSort(List<Employee> emp) {
			Employee e1= new Employee();
			e1.setName("dd");
			e1.setCity("Delhi");
			e1.setId(4);
			
			Employee e2= new Employee();
			e2.setName("vinu");
			e2.setCity("Delhi");
			e2.setId(3);
			
			Employee e3= new Employee();
			e3.setName("vinu");
			e3.setCity("Delhi");
			e3.setId(3);
			
			emp.add(e1);
			emp.add(e2);
			emp.add(e3);
		}
		
	

}
