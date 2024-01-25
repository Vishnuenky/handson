package com.program.Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = Arrays.asList(1, 2, 2, 2, 4, 3, 4, 6, 7, 1, 5, 6);

		// l.stream().filter(x->x%2==0).forEach(x->System.out.println(x));

		Set<Integer> s = new HashSet<Integer>();
		l.stream().filter(x -> !s.add(x)).forEach(System.out::println);
		System.out.println("****************");
		
		List<Integer> ll = Arrays.asList(1, 2, 2, 2, 4, 3, 4, 6, 7, 1, 5, 6);
		Set<Integer> ss = new HashSet<Integer>();
		ll.stream().filter(x -> !ss.add(x)).distinct().forEach(System.out::println);
		System.out.println("****************");
		
		
		List<Integer> lll = Arrays.asList(1,2,2,2,4,3,4,6,7,1,5,6);
		Set <Integer> sss = new HashSet<Integer>();
		lll.stream().filter(x->!sss.add(x)).collect(Collectors.toSet()).forEach(System.out::println); 
	}

}
