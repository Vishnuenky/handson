package com.program.Java8;

import java.util.*;

public class NumberStartsWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l  = Arrays.asList(11,14,56,1112,43,10);
		
		l.stream().map(s->s+"").filter(x->x.startsWith("1")).forEach(System.out::println);

	}

}
