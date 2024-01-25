package com.program.basic;

public class FibinacciSerious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int temp=n1+n2;
		System.out.print(n1+" "+n2);
		
		int n=5;
		for(int i=0;i<n;i++) {
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;
			temp=n1+n2;
			
		}
	}

}
