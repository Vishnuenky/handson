package com.program.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "visiseabh";
		
		char[] a = str.toCharArray();
		int count =0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a'|| a[i]=='e'||a[i]=='i'||a[i]=='o'|| a[i]=='u'||a[i]=='A'||a[i]=='E'|| a[i]=='I'||a[i]=='O'||a[i]=='U') {
				count++;
			}
		}
		
		System.out.println(count);
		
		List<Boolean> l =Arrays.stream(str.split("")).map(e->e=="a"|| e=="e"||e=="i"||e=="o"|| e=="u"||e=="A"||e=="E"|| e=="I"||e=="O"||e=="U").collect(Collectors.toList());
		System.out.println(l);
		long res = l.stream().count();
		System.out.println(res);
		
		List<String> ll =Arrays.stream(str.split("")).filter(e->e=="a"|| e=="e"||e=="i"||e=="o"|| e=="u"||e=="A"||e=="E"|| e=="I"||e=="O"||e=="U").collect(Collectors.toList());
		//System.out.println(l);
		long res11 = l.stream().count();
		System.out.println(res11);
		
		
		long res1 =str.chars().filter(e->e=='a'|| e=='e'||e=='i'||e=='o'|| e=='u'||e=='A'||e=='E'|| e=='I'||e=='O'||e=='U').count();
		System.out.println(res1);
		
		//str.chars().filter(e->e=='a'|| e=='e'||e=='i'||e=='o'|| e=='u'||e=='A'||e=='E'|| e=='I'||e=='O'||e=='U').count();;
	}

}
