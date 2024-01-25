package com.program.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		int[] a = {1,4,2,6,8,};
		List<Integer> l = Arrays.stream(a).mapToObj(Integer::valueOf).sorted().collect(Collectors.toList());
		l.stream().forEach(System.out::println);
		
		List<Integer> l1 = Arrays.stream(a).mapToObj(Integer::valueOf).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		l1.stream().forEach(System.out::println);
		
		List<Integer> l2 = Arrays.stream(a).mapToObj(Integer::valueOf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		l2.stream().forEach(System.out::println);
		
		
		int min = Arrays.stream(a).mapToObj(Integer::valueOf).min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("**************"+min);
		
		List<Integer> ll = Arrays.stream(a).mapToObj(Integer::valueOf).sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		ll.stream().forEach(System.out::println);
		
		
		//STRING SORTING NATURAL ORDER
		String[] str = {"apple","banana","orangae"};
		//List<String> s = Arrays.asList("apple","banana","orangae");
		List<String> s = Arrays.asList(str);
		
		
		s.stream().sorted().forEach(x->System.out.println(x));
		s.stream().sorted(Comparator.naturalOrder()).forEach(x->System.out.println("*"+x));
		//s.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
		//STRING SORTING IN REVERSE ORDER
		List<String> newl=s.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//List<String> newl=s.stream().sorted().collect(Collectors.toList());
		newl.stream().forEach(x->System.out.println(x));
		
		
		
		System.out.println("STRING natural SORTING USING LAMBADA EXPRESSION");
		List<String> ss = new ArrayList<String>(Arrays.asList(str));
		List<String> nl=ss.stream().sorted((i1,i2)->i1.compareToIgnoreCase(i2)).collect(Collectors.toList());
		nl.stream().forEach(System.out::println);
		
		System.out.println("STRING custom SORTING USING LAMBADA EXPRESSION");
		List<String> nll=ss.stream().sorted((i1,i2)->i2.compareToIgnoreCase(i1)).collect(Collectors.toList());
		nll.stream().forEach(System.out::println);
		
		
		
		List<Integer> il = Arrays.asList(9,9,1,1,2,3,11,6);
		
		int res = il.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println("*****"+res);
	}

}
