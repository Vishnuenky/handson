package com.program.basic;

public class RemoveSpecialCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="vishnuDevi@123$%# >shri1))";
		String s1 ="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if((Character.isDigit(s.charAt(i))) || (Character.isLetter(s.charAt(i))) || (Character.isWhitespace(s.charAt(i)))){
				s1=s1+s.charAt(i);
			}
			else {
				count++;
			}
		}
		System.out.println(s1);
		System.out.println(count);
		
		StringBuffer sb = new StringBuffer();
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				sb.append(ch[i]);
			}
			
		}
		System.out.println(sb);
	}

}
