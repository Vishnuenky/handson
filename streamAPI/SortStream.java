package com.program.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(90);
		al.add(51);
		al.add(3);
		al.add(88);
		al.add(1);
		
		//List<Integer> newl = new ArrayList<Integer>();
		Stream<Integer> newl= al.stream().sorted();//ascending order
		newl.forEach(x->System.out.println(x));
		
		Stream<Integer> nl=al.stream().sorted((i1,i2)->i2.compareTo(i1));
		nl.forEach(x->System.out.println(x));

		Integer n2=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(n2);
		
		Integer n3=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(n3);
	}

}
