package com.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String email =sc.next();
		Pattern p=Pattern.compile(("^[a-zA-Z0-9_!^&()@%*+=#-]+[@][a-zA-Z0-9]+[.][A-Za-z]{2,3}"),Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(email);
		System.out.println(m.find());
		/*if(p.matcher(email).matches()) {	this is also coorect
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}*/
	}

}
