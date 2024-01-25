package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhnNoMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reg="[9][0-9]{9}";
		//int n= 8888888888; as phn no. is too long, we can give in string
		String n="8888888888";
		Pattern p = Pattern.compile(reg);
		Matcher m= p.matcher(n);
		if(m.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
	}

}
