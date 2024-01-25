package com.program.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AddElementInSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"apple","berry","banana","banana","orange","mango"};
		
		List<String> ll = Arrays.asList(str);
		System.out.println(ll);
		
		List<String> l = Arrays.asList("apple","berry","banana","banana","orange","mango");
		Set<String> s = l.stream().collect(Collectors.toSet());
		s.add("cheese");
		System.out.println(s);

	}

}
