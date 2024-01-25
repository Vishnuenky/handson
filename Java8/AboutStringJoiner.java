package com.program.Java8;

import java.util.*;

public class AboutStringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner j= new StringJoiner(" ","[","]");
		System.out.println(j);
		j.setEmptyValue("empty");
		System.out.println(j);
		j.add("vd");
		j.add("sh");
		System.out.println(j);
		System.out.println(j.length());
		
		StringJoiner j1=new StringJoiner(":","{","}");
		j1.add("vdddd");
		j1.add("shddd");
		System.out.println(j1);
		StringJoiner j2=j.merge(j1);
		System.out.println(j2);//during merge, we could get only first stringjoiner prefix and suffix, second wont work
	}

}
