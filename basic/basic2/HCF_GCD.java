package com.program.basic;

import java.util.Scanner;

public class HCF_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Highest Common Divisor or Greatest Common Divisor
		
		System.out.println("Enter 1st Number..");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number..");
		int b = sc.nextInt();
		
		int g=0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				g=i;
			}
		}
		
		System.out.println(g);

	}

}
