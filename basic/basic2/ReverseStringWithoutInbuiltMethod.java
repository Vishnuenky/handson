package com.program.basic;

public class ReverseStringWithoutInbuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vishnu";
		char[] ch = str.toCharArray();
		int l=ch.length-1;
		reverseString(ch,l);
		
		
	
	}

	public static void reverseString(char[] ch, int l) {
		// TODO Auto-generated method stub
		if(l>0) {
			System.out.print(ch[l-1]);
			l--;
			reverseString(ch,l);
		}
		
	}

}
