package com.program.basic;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb=new StringBuffer();
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ') {			// will remove only whitespace not tab
				sb.append(c[i]);
			}
		}
		System.out.println(sb);
		
		System.out.println("#############\n***************"+"\n"+"&&&&&&&&&&&&&");
		
		String s1="		Geeks for	Geeks	geeks ";
		System.out.println(s1.trim());// remove leading and trailing single space and tab(if present in 1st and last)
		//System.out.println(s1.strip());
		System.out.println(s1.replaceAll("\\s",""));//remove tab,\n,space{both"\\s" and "\\s+"}->produce same result
		System.out.println(s1);
	}

}
