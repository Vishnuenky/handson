package com.program.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class InsertElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1,2,3,4,5,6);
		System.out.println("Enter index & elements to be inserted ");
		Scanner sc = new Scanner(System.in);
		
		int index=sc.nextInt();
		Integer ele =sc.nextInt();
		
		
		//l.add(index,ele);---we will get unsupported exception here
		
		System.out.println(l);
		
		ArrayList<Integer> k = new ArrayList<Integer>(l);
		k.set(index,ele);
		//k.add(index,ele); --this can also be done
		System.out.println(k);
		
		
		//Adding element in set
		Set<Integer> s =l.stream().collect(Collectors.toSet());
		s.add(33);
		System.out.println(s);
		
		boolean ss =l.stream().collect(Collectors.toSet()).add(55);
		System.out.println(ss);//here also it wont print 55
		System.out.println(l);
		
		

	}

}
