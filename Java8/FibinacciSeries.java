package com.program.Java8;

import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collectors;

public class FibinacciSeries {

	public static void main(String[] args) {
		
		String s = Stream.iterate(new int[] {0,1},t->new int[] {t[1],t[0]+t[1]} )
		.limit(5)
		.map(t->t[0])
		.map(String::valueOf)
		.collect(Collectors.joining(","));

		//mapToObj(String::valueOf)---this can be used only to convert primitive type(int) to Object type(interger).here already we have integer(obj type) that cant again converted to String(obj type).So here we are using map() to point it to String
		
		System.out.println(s);
		
		String ss= Stream.iterate(new int[] {0,1},t->new int[] {t[1],t[0]+t[1]})
				.limit(3).map(t->t[0]).map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(ss);
		
	}

}
