package com.program.basic;

import java.util.*;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		
		StringBuffer sb=new StringBuffer("vishnu Devi");
		System.out.println(sb.replace(0,2,"ff"));
		System.out.println(sb);
		System.out.println(sb.length());
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.equals("ABCD"));
		System.out.println(s.equalsIgnoreCase("ABCD"));
		System.out.println(s.contains("bc"));
		
		System.out.println(s.indexOf("c"));
		System.out.println(s.indexOf("bc"));
		System.out.println(s.indexOf("z"));//it will return -1, if the string id not present
		
		System.out.println("vishnu".concat("devi"));
		System.out.println(s.concat("devi"));
		
		System.out.println("vishnu".substring(3));
		System.out.println("vishnu".substring(3,5));
		//System.out.println("vishnu".substring(3,7));we get stringindexoutofbound exception
		
		System.out.println(s.replace("z","g"));// prints the original string
		System.out.println(s.replace("a","g"));
		System.out.println(s.replace("ab","ggggggg"));
		System.out.println(s.replace("ab","ggggggg").length());
		System.out.println(s);//will only print the previuos string, but in stringbuffer we will get the replaced string.
		System.out.println(s.length());
		
		
		//STRING ROTATION:
		String s1="ABCD";//PENCILMY
		String s2="cdab";//;MYPENCIL
		if((s1.length()==s2.length()) && ((s1+s2).indexOf("cdab")!=-1)) {
			System.out.println("it is rotation");
			//System.out.println(s1+s2);
		}else {
			System.out.println("not rotation");
		}
		
		System.out.println((s1+s2).indexOf("cdab"));
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		
		System.out.println(l1);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.addAll(l1);
		System.out.println(l2);
		
	}

}