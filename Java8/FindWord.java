package com.program.Java8;

import java.util.*;

public class FindWord {

	public static void main(String[] args) {
		String[] str= {"apple","berry","banana","banana","orange","mango"};
		List<String> l = Arrays.asList("apple","berry","banana","banana","orange","mango");
		
		//Optional<String> o =Arrays.stream(str).sorted(Comparator.naturalOrder()).filter(x->x.startsWith("b")).findFirst();--This can also be done.
		
		long o2 =l.stream().sorted(Comparator.reverseOrder()).filter(x->x.startsWith("b")).count();
		System.out.println(o2);
		

		long o3 =l.stream().sorted(Comparator.reverseOrder()).filter(x->x.startsWith("b")).distinct().count();
		System.out.println(o3);
		
		Optional<String> o =l.stream().distinct().sorted(Comparator.reverseOrder()).filter(x->x.startsWith("b")).findFirst();
		if(o.isPresent()) {
			System.out.println(o);
			
		}else {
			System.out.println("empty");
		}
		
		String o1 =l.stream().filter(x->x.startsWith("b")).findFirst().get();
		
			System.out.println("========"+o);
		
			
			int[] aa = {1,2,3,45};
			List<Integer> ll = Arrays.asList(1,2,3,45);
			
		Integer[] a = {1,2,3,45};
		List<Integer> lli = Arrays.asList(a);
		
		
		
		String[] str1= {"apple","berry","banana","banana","orange","mango"};
		List<String> l1 = Arrays.asList(str1);
	}

}
