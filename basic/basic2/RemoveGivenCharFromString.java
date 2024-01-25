package com.program.basic;

import java.util.Scanner;

public class RemoveGivenCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=new String("vvvidhfygvkejuvv");
		char l=sc.next().charAt(0);
		StringBuffer sb = new StringBuffer();
		char[] c=str.toCharArray();
		
		for(char ct:c) {
			if(ct!=l) {
				sb.append(ct);
			}
		}
		System.out.println(sb);
		sc.nextLine();
		String str1 = sc.nextLine();//.next()--will print only one word
		System.out.println(str1);

	}

}
