package com.program.basic;

public class Palindrome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int temp=n;
		int rem=0;
		int rev=0;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println(temp+" is a palindrome number");
		}
		else {
			System.out.println(temp+" is not a palindrome number");
		}
	}

}
