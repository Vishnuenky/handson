package com.program.basic;

public class DifferenceBetweenTwoWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vishnu devi is good girl";
		String[] c=str.split(" ");
		
		String s1 = "devi";
		String s2 = "girl";
		int l1=0;
		int l2=0;
		
		for(int i =0;i<c.length;i++) {
			if(s1.equals(c[i])){
				l1=i;				
			}
			//System.out.println(l1);
			if(s2.equals(c[i])) {
				l2=i;
			}
		}
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println("*******************"+(l2-l1-1));
		
		
		String str1="vishnu";
		char[] c1=str1.toCharArray();
		char c2='s';
		char c3='n';
		int l3=0;
		int l4=0;
		for(int i=0;i<c1.length;i++) {
			if(c2==(c1[i])) {
				l3=i;
			}
			if(c3==c1[i]) {
				l4=i;
			}
		}
		
		System.out.println(l3);
		System.out.println(l4);
		
		System.out.println("********************************"+(l4-l3-1));

	}

}
