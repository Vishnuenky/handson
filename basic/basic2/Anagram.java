package com.program.basic;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="SILENN";
		String s2="SILENT";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(c1.length!=c2.length) {
			System.out.println("not anagram");
		}else {
			for(int i=0;i<c1.length;i++) {
				if(c1[i]!=c2[i]) {
					System.out.println("not anagram");
					System.exit(0);
				}
			}
			System.out.println(" anagram");
		}
	}

}
