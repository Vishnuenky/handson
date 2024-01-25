package com.program.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class CodeSnippet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TCS questions
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(200);
		ArrayList<Integer> ll = new ArrayList<Integer>();
		//l.add(ll);--we will get error while using add() to merge two list
		
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(44);
		l2.add(55);
		
		
		//combine two list and sort it
		Stream.of(l,l2).flatMap(Collection::stream).sorted().forEach(e->System.out.println(e));
		Stream.concat(l.stream(), l2.stream()).forEach(System.out::println);
		
	}

}
