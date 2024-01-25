package com.array;
import java.util.*;
import java.util.stream.Collectors;


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,4,4,5,6,8};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(Integer i:a) {
			hs.add(i);
		}
		System.out.println(hs);
		
		List<Integer> l= Arrays.asList(1,2,3,4,4,4,5,6,8);
		l.stream().distinct().forEach(System.out::println);
		
		Set<Integer> s=l.stream().collect(Collectors.toSet());
		System.out.println(s);
		
		Set<Integer> ss = new HashSet<Integer>(); 
		List<Integer> ll=l.stream().filter(e->ss.add(e)).collect(Collectors.toList());
		System.out.println(ss);
		
		

	}

}
