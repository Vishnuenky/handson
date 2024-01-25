package com.program.basic;

import java.util.ArrayList;

public class SeparatePositiveAndNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,4,5,-9,8,-5};
		
		int posCount=0;
		int negCount=0;
		
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				l1.add(arr[i]);
				posCount=posCount+arr[i];
			}
			if(arr[i]<0) {
				l2.add(arr[i]);
				negCount=negCount+arr[i];
			}
		}
		System.out.println(l1);
		System.out.println("Positive count is:"+posCount);
		System.out.println(l2);
		System.out.println("Negative count is:"+negCount);
		
	}

}
