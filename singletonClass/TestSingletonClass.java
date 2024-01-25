package com.program.singletonClass;

public class TestSingletonClass {

	public static void main(String[] args) {
		singletonClass s=singletonClass.getInstance();
		singletonClass s1=singletonClass.getInstance();
		
		if(s==s1) {
			System.out.println("both are same");
			System.out.println(s.hashCode()+" "+s1.hashCode());
		}

	}

}
