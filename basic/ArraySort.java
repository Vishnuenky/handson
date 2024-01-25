package com.program.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa= {12,45,76,2,3,4,71,1};
		Arrays.sort(aa);
		System.out.println(Arrays.toString(aa));//To print Array, we are converting to string
		
		//EqualityCheck
		int[] aa1= {12,45,76,2,3,4,71,1};
		int[] bb1= {45,12,76,71,1,2,3,4};
		Arrays.sort(aa1);
		Arrays.sort(bb1);
		System.out.println(Arrays.equals(aa1,bb1));// before checking equality,we have to sort
		
		int[] a= {2,3,4,71,1};
		/*int n=5;
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];*/
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {//this will print in ascending order--but if we give for(int j=i+1;j<a.length;j++)--it will print in descending order
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(Arrays.toString(a));
		
		int[] b= {21,33,4,71,1};
		//Arranging in ascending order by using single loop
		for(int i =0;i<b.length-1;i++) {
			if(b[i]>b[i+1]) {
				temp=b[i];
				b[i]=b[i+1];
				b[i+1]=temp;
				i=-1;
			}
		}
		
		System.out.println(Arrays.toString(b));
	}

}
