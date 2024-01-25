package com.program.basic;
import java.util.*;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Least Common Divisor
		
		System.out.println("Enter 1st Number..");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number..");
		int b = sc.nextInt();
		
		int lcm = (a>b)?a:b;
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
		

	}

}
