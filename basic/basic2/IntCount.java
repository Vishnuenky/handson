package com.program.basic;

public class IntCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=12356;
		String s = String.valueOf(i);
		System.out.println(s.length());
		
		int i1=12345;
		int count=0;
		while(i1>0) {
			count++;
			i1=i1/10;
		}
		System.out.println(count);
	}

}
