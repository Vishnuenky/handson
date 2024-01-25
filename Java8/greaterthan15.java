package com.program.Java8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class greaterthan15 {

	public static void main(String[] args) {
		List<Integer> l =new ArrayList<Integer>();
		l.add(1);
		l.add(9);
		l.add(59);
		l.add(99);
		l.add(19);
		l.add(8);
		l.add(1);
		l.add(9);
		
//		Stream s = l.stream().filter(x->x>=15);
//				s.forEach(x->System.out.println(x));
		List<Integer> ll = l.stream().filter(x->x>=15).collect(Collectors.toList());		
		ll.forEach(System.out::println);		
	}

}
