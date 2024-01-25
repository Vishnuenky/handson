package com.program.basic;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,4,6,9,12};
		int[] b = {13,14,15};
		int n1=a.length;
		int n2=b.length;
		
		int[] c = new int[n1+n2];
		
	    int i=0;	    
	    int j =0;
	    int k=0;
	    
		while (i<n1 && j<n2) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];
//				k++; we can also increment k and i and j like this
//				i++;
			}else {
				c[k++]=b[j++];
//				k++;
//				j++;
			}
		}
		
		while(i<n1) {
			c[k++]=a[i++];
//			k++;
//			i++;
		}
		while(j<n2) {
			c[k++]=b[j++];
//			k++;
//			j++;
		}
	    
	    System.out.println(Arrays.toString(c));
		

	}

}
