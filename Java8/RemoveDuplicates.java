package com.program.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int [] a = {1,1,2,3,4,11,1,2,6,5};
		
		List<Integer> l =Arrays.asList(1,1,2,3,4,11,1,2,6,5);
		
		l.stream().distinct().forEach(System.out:: println);
		
		List<Integer> ll = Arrays.asList(1,2,3,4,4,11,21,12,1,10);
		
		Set<Integer> s = ll.stream().collect(Collectors.toSet());
		
		System.out.println(s);
		//System.out.println(null)-CE--because compiler does not know which object it is(whether it Object or String or Integer);
		
	}

}
