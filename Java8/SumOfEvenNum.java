package com.program.Java8;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfEvenNum {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
		
		
		
		int[] a= {1,2,3,4,5};
		List<Integer> l=Arrays.stream(a).mapToObj(Integer::valueOf).filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(l);
		
		int res = Arrays.stream(a).mapToObj(Integer::valueOf).filter(e->e%2==0).reduce((c,b)->c+b).get();
		System.out.println(res);
		
		int r=IntStream.of(1,2,3,4,5).filter(e->e%2==0).sum();
		System.out.println(r);
		
		List<Integer> s = Arrays.asList(1,2,3,4,5,6,7,8);
		Integer res1= s.stream().filter(e->e%2==0).reduce((c,b)->c+b).get();
		System.out.println(res1);
		
	;
		
		//int res1 = Arrays.stream(a).mapToObj(Integer::valueOf).filter(e->e%2==0).sum();
		//System.out.println(res1);
		
		//List<Integer> l=Arrays.stream(a).mapToObj(Integer::valueOf).filter(e->e%2==0).collect(Collectors.toList());
		//Stream.of(a).filter(null);
		
	}

}
