package com.program.Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class groupbystringlength {

	public static void main(String[] args) {
		String[] s = {"apple","apple","pears","pears","banana","grape","mango","orange"};
		List<String> l = Arrays.asList(s);
		
		
		//grouping of words by length
		//List<String> l = new ArrayList<String>(Arrays.asList(s));
		Map<Integer,List<String>> m = l.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(m);
		m.forEach((x,v)->System.out.println(x+"-----"+v));//to print map in java8
		
		Map<String,Long> mm= Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(mm);
	}

}
