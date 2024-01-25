package com.program.basic;

public class SentenceWordReverse {

	public static void main(String[] args) {
		
		String str ="Codding is very easy";
		System.out.println(str.length());
		String[] sarr = str.split(" ");
		
		StringBuffer sb = new StringBuffer();
		int l = sarr.length;
		for(int i =l-1;i>=0;i--) {
			sb.append(sarr[i]+" ");
		}
		//System.out.println(sb.toString());//we can also directly convert this to string
		System.out.println(sb.toString());
		System.out.println(sb.length());
		
		
		String ss = sb.toString().strip();
		System.out.println(ss.length());//here we can get the same length as input string
		
		
		//Reversing by Using StringBuffer
		StringBuffer rev = new StringBuffer();
		for(int i=0;i<sarr.length;i++) {
			StringBuffer sb1 = new StringBuffer(sarr[i]);//we are converting each word in string array to stringbuffer to using reverse()
			sb1.reverse();
			rev.append(sb1);
			rev.append(" ");
		}
		System.out.println(rev);
		
		
		//Reversing by Using String
		String rev1="";
		for(int i=0;i<sarr.length;i++) {
			for(int j=sarr[i].length()-1;j>=0;j--) {
				rev1=rev1+sarr[i].charAt(j);
			}
			rev1=rev1+" ";
			System.out.println(rev1);
		}
		
		
		
		
		
		
		
	}

}
