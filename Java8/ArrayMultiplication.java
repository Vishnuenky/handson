package com.program.Java8;

import java.util.*;
import java.util.stream.Stream;
public class ArrayMultiplication {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		List<Integer> l = Arrays.asList(1,2,3,4,5,6);
//		List<Integer> l = Arrays.asList(a);---we couldnot do this
//		List<Integer> l =  new ArrayList<Integer>();
//		for(Integer x:a) {
//			l.add(x);
//		}
		
		Optional<Integer> o = l.stream().reduce((c,b)-> c*b);
		System.out.println(o);
		
		int res = l.stream().reduce((c,b)-> c*b).get();
		System.out.println(res);
		
		
		Optional<Integer> oi= Arrays.stream(a).mapToObj(Integer::valueOf).reduce((c,b)->c*b);
		System.out.println(oi);
		if(oi.isPresent()) {
			System.out.println(oi.get());
		}else {
			System.out.println("No Value");
		}
		
		
		
		
		
		
		
		
		
		
		
		//-----THE BELOW CODE RUN COMPLETELY FINE IN ONLINE GDB JAVA COMPILER
//		int[] a = {1,2,3,4,5,6};
//		//List<Integer> l = Arrays.asList(a);---we couldnot do this
//		List<Integer> l =  new ArrayList<Integer>();
//		for(Integer x:a) {
//			l.add(x);
//		}
//		//int res = l.stream().reduce((c,b)->c*b).get(); -- This is also correct
//		int res= Arrays.stream(a).mapToObj(Integer::valueOf).reduce((c,b)->c*b).get();
//		System.out.println(res);
//		//or
//		Optional<Integer> o= Arrays.stream(a).mapToObj(Integer::valueOf).reduce((c,b)->c*b);
//		 if(o.isPresent()){
//		     System.out.println(o);
//		 }else{
//		     System.out.println("Empty");
//		 }
	}

}
