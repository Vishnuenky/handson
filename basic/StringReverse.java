import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str1=sc.next();
		
		//how to get character in in scanner
		char cc = sc.next().charAt(0);
		System.out.println(cc);
		
		//method 1
		String tem="";
		int l=str1.length();
		for(int i=l-1;i>=0;i--) {
			tem=tem+str1.charAt(i);
		}
		System.out.println(tem);
		
		
		//method 2
		StringBuffer s = new StringBuffer();
		//char[] c= s.toCharArray();  - stringbuffer cant be converted into char array
		char[] c= str1.toCharArray();  //new char[s.length()];
		for(int i=c.length-1;i>=0;i--) {
			s.append(c[i]);
		}
		System.out.println("*****");
		System.out.println(s);
		
		
		//method 3 - by using StringBuffer
		StringBuffer sb= new StringBuffer("vishnu");
		System.out.println(sb.reverse());
		System.out.println(sb.append("devi"));
		System.out.println(sb.append(19));

	}

}
