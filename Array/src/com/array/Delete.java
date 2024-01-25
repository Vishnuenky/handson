package com.array;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int a[] = new int[5];
		 for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		 }
		 
		 System.out.println("Enter the inserting position");
		 int pos=sc.nextInt();
			
		
			
		for(int i=pos;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=0;
		
		System.out.println("Array Elements after deleting given element at specified position");
		for(int i :a) {
			System.out.println(i);
		}
		

	}

}
