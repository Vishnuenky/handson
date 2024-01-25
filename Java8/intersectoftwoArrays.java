package com.program.Java8;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class intersectoftwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,2,4};
		//List<Integer> a = Arrays.stream(arr1).mapToObj(Integer::valueOf).distinct().collect(Collectors.toList());
		int[] arr2 = {2,3,5};
//		Set<Integer> s = new HashSet<Integer>();
//		
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]==(arr2[j])) {
//					s.add(arr1[i]);
//				}
//			}
//		}
//		
//		System.out.println(s);
		
		//iNTERCERT OF TWO ARRAY -JAVA8
		Set<Integer> s= Arrays.stream(arr1).mapToObj(Integer::valueOf).filter(x->Arrays.stream(arr2).anyMatch(y->y==x)).distinct().collect(Collectors.toSet());
		System.out.println(s);

	}

}
