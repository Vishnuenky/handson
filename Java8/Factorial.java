package com.program.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Long res = LongStream.rangeClosed(1, n).reduce(1, (long x,long y)->x*y);//we can't use get here-- We get CE
		System.out.println(res);
		
		Long ress = LongStream.rangeClosed(1, n).reduce(0, (long x,long y)->x+y);
		System.out.println(ress);
		
		
		System.out.println("STRING REVERSE USING JAVA8 WITHOUT USING 3RD VARIABLE AND INBUILT FUNCTION");
		char[] ch = "Aniruddh".toCharArray();
	    
		IntStream.range(0, ch.length)
	        .mapToObj(i -> ch[(ch.length - 1) - i])
	        .forEach(System.out::print);
		
		
		System.out.println();
		System.out.println("Another logic od revrsing string");
		
		IntStream.rangeClosed(1, ch.length)
        .mapToObj(i -> ch[ch.length - i ])
        .forEach(System.out::print);
		
		//we cant use foreach also--CE
		//LongStream.rangeClosed(1, n).reduce(1, (long x,long y)->x*y).forEach(e->System.ot.println(e));
		
	    System.out.println();
	    
		String s= Stream.iterate(new int[] {0,1},t->new int[] {t[1],t[0]+t[1]})
				.limit(5)
				.map(t->t[0])
				.map(String::valueOf)
				.collect(Collectors.joining(","));
		
		System.out.println(s);
		

	}

}
