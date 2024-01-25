package com.program.basic;

import java.util.Scanner;

public class MaxNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,71,1};
		int n=5;
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		
	}

}
