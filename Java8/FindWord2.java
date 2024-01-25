package com.program.Java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//import java.util.stream.Collectors;

public class FindWord2 {

	
	public static void main(String args[]) {
		
	
		String[] s = {"apple","banana","grape","apple"};
		
		List<String> l = Arrays.asList("apple","banana","grape","apple");
		
		boolean res = l.stream().anyMatch(e->e.equals("banana"));
		if(res) {
		System.out.println("banana is present");
		}else {
			System.out.println("banana is not present");
		}
		
		Map<String,Long> m = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(m);
		m.entrySet().stream().filter(e->e.getKey().equals("apple")).forEach(e->System.out.println("occurance of "+e.getKey()+" is "+e.getValue()+" times"));
		
		//below two are due to , we have converted the key,value pair to entryset
		m.entrySet().stream().filter(e->e.getKey().equals("apple")).forEach(e->System.out.println("****************"+e));
		m.entrySet().stream().filter(e->e.getKey().equals("apple")).forEach(System.out::println);
		
		
		m.entrySet().stream().filter(e->e.getKey().equals("apple")).map(e->e.getValue()).forEach(e->System.out.println("occurance of Apple is :"+e));
		
		
		long occ=l.stream().filter(d->d.equals("apple")).count();
		System.out.println(occ);
	}
	

}
		
		
	


