package com.program.Java8;

import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		
		int[]  arr = {1,2,3,4,5};
		
		int as=Arrays.stream(arr).sum();
		System.out.println(as);
		
		OptionalInt m=Arrays.stream(arr).max();
		System.out.println(m);
		
		OptionalInt mi=Arrays.stream(arr).min();
		System.out.println(mi);
		
		OptionalDouble ma=Arrays.stream(arr).average();
		System.out.println(ma);
		
		//OptionalDouble ab = Arrays.stream(arr).average();
		OptionalDouble ab = Arrays.stream(arr).filter(e->e>2).average();
		System.out.println(ab);
		
		List<Integer> ar =Arrays.asList(1,2,3,4,5);
		int ab11 = ar.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max"+ab11);
		
		int ab112 = ar.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Min"+ab112);
		
		long c = ar.stream().count();
		System.out.println(c+"**********");
		
		List<Integer> a =Arrays.asList(1,2,3,4,5);
		
		//SUM OF NUMBERS IN ARRAY
		int re = a.stream().reduce((x, y)->x+y).get();
		System.out.println(re);
		
		//SUM OF EVEN NUMBERS
		int res = a.stream().filter(e->e%2==0).reduce((b,f)->b+f).get();
		System.out.println(res);
	}

}
