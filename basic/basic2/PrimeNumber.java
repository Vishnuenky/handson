package com.program.basic;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		
		
		
		
		
		if (n == 0 || n == 1) {
			System.out.println(n+"is not a prime number");
			System.exit(0);
			//break; -- cant use out side the loop
		}
		if (n == 2) {
			System.out.println(n+"is a prime number");
			System.exit(0);
		}
		int count=0;
		for(int i=2;i<=n;i++) {//i<=n/2 , we can also use this condition
			if(n%i==0) {
				count++;
			}
			if(count>1) {
				System.out.println(n+"is not a prime number");
				break;
			}
		}
		if(count==1) {
			System.out.println(n+"is a prime number");
		}
	}

}
