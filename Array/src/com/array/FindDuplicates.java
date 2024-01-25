package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] a= {1,2,2,3,2,4,5,5,6,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		System.out.println("FINDING DUP USING JAVA8");
		
		List<Integer> l = Arrays.asList(1,2,2,3,4,5,5,6);
		Set<Integer> sss = new HashSet<Integer>();
		l.stream().filter(e->!sss.add(e)).forEach(v->System.out.println(v));
		

	}

}
