package com.program.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class JoinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"Hello","world", "of","java"};
		List<String> l = Arrays.asList(s);
		String res = l.stream().collect(Collectors.joining());
		System.out.println(res);
		
		String r=l.stream().collect(Collectors.joining(" "));
		System.out.println(r);
		
		String rR=l.stream().collect(Collectors.joining(""));
		System.out.println(rR);
		
		//STRINGJOINER
		//StringJoiner s = new StringJoiner(" ");
	}

}
