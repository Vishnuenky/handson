package com.array;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		int n=5;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements before inserting");
		for(int i :arr) {
			System.out.println(i);
		}
		
		System.out.println("Enter the inserting(index value) position");
		int pos=sc.nextInt();
		
		System.out.println("Enter the inserting value");
		int value=sc.nextInt();
		
		int len = n;
		
		for(int i=n;i>pos;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos]=value;
		
		System.out.println("Array Elements after inserting given element at specified position");
		for(int i :arr) {
			System.out.println(i);
		}
		
		System.out.println("Array Elements after inserting given element at first position");
		
		for(int i=n;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=value;
		
		for(int i :arr) {
			System.out.println(i);
		}
		
	}

}
