package com.program.Java8;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class StringWordFrequency {

	public static void main(String[] args) {
		String str="vvvhhngusyee";
		
		
		//char[] carr=str.toCharArray();--we cant use char inside Arrays.stream()
		Map<String, Long> m = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(m);
		
		System.out.println("DUPLICATE LETTERS IN STRING");
		m.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).forEach(e->System.out.println(e));
		
		List<String> s = m.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
		System.out.println(s);
		s.stream().forEach(e->System.out.println(e));
		
		System.out.println("NUMBER OF WORDS COUNT IN STRING");
		Long res = Arrays.stream(str.split("")).count();//wordcount
		System.out.println(res);

	}

}
