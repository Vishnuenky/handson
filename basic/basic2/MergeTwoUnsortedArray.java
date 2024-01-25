package com.program.basic;

import java.util.Arrays;

public class MergeTwoUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {11,9,7,41};
		 int[] b = {6,4,2,17,1};
		 int n1=a.length;
		 int n2=b.length;
		 
		 int[] c =  new int[n1+n2];
		 
		 int i=0,j=0,k=0;
		 
		 while(i<n1) {
			 c[k]=a[i];
			 k++;
			 i++;
		 }
		 while(j<n2) {
			 c[k]=b[j];
			 k++;
			 j++;
		 }
		
		//Before sorting
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);  
	    System.out.println(Arrays.toString(c));

	}

}
