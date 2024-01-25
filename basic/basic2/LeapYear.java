package com.program.basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int year ;
		year=sc.nextInt();
		
		if(year%400==0) {
			System.out.println(year+" is a leap year");
		}else if(year%4==0 && year%100!=0) {
			System.out.println(year+" is a leap year");
		}else {
			System.out.println(year+" is not a leap year");
		}

	}

}
