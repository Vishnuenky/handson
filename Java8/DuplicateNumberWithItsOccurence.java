package com.program.Java8;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumberWithItsOccurence {

	public static void main(String[] args) {
		
			List<Integer> l = Arrays.asList(3,3,4,1,1,2,6,1,7);
			
			Map<Integer,Long> hl = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			
			hl.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
			
			//To show duplicate Number with its number of occurence
			hl.entrySet().stream().filter(e->e.getValue()>1).forEach(e->System.out.println(e.getKey()+" is repeated for "+e.getValue()+" times"));;
			
			//To print duplicate number alone
			hl.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).forEach(System.out::println);
			
			hl.entrySet().stream().filter(e->e.getValue()>1).forEach(e->System.out.println("********"+e.getKey()));
			
			
			//to print hashmap
			hl.forEach((k,v)->System.out.println(k+"^^^^^"+v));
			
			//below is not possible -- after converting to entrySet, we can't use k,v. We can only use getKey() and getValue()
			//hl.entrySet().stream().forEach((k,v)->System.out.println(k+"^^^^^"+v));
			
			
			///How to collect hashmap in list
			List<Entry<Integer,Long>> s = hl.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());		
			System.out.println(s);
			//System.out.println("*******"+((Entry<Integer, Long>) s).getKey()+"*****"+((Entry<Integer, Long>) s).getKey());//We will get RuntimeException here
	}

}
