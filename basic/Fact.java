package com.program.basic;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		
		Long res = LongStream.rangeClosed(1,n).reduce(1,(long x,long y)->x*y);
		
		System.out.println(res);
		
		
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		Long sum1 = LongStream.rangeClosed(0,n).reduce(0,(long x,long y)->x+y);
		
		System.out.println(sum1);
		
	}

}
