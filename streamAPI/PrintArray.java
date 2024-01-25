package com.program.streamAPI;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintArray {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		List<Integer> newl = new ArrayList<Integer>();
		newl= al.stream().filter(i->i>1).collect(Collectors.toList());//we separate the sentence
		newl.stream().forEach(x->System.out.println(x));//this is also correct , below comment line also correct
		//newl.forEach(x->System.out.println(x));
	}
}


