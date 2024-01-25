import java.util.Arrays;

public class ExcelSelectedCellCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "A10:C8";
		String[] s = str.split(":");
		
		System.out.println(Arrays.toString(s));
		
		char a = s[0].charAt(0);//System.out.println(a);--A
		char c = s[1].charAt(0);//System.out.println(C);--C
		
		
		/*
		 * int b = (s[0].charAt(1))-'0'; //The respective integer is calculated from
		 * this ASCII value by subtracting it from the ASCII value of 0. In other words,
		 * this method converts the char to int by finding the difference between the
		 * ASCII value of this char and the ASCII value of 0. System.out.println(b);
		 * int d = Integer.parseInt(String.valueOf(s[1].charAt(1))); System.out.println(d);
		 */
		
		
		String s1 = (s[0].substring(1));
		int b = Integer.parseInt(s1);
		
		String s2 = (s[1].substring(1));
		int d = Integer.parseInt(s2);
		
		
		
		if(a==c&&d==b) {
			System.out.println("Invalid Input");
		}else {
			int n1=Math.abs(c-a)+1;
			
			int n2=Math.abs(d-b)+1;
			
			System.out.println(n1*n2);
		}
		
	}

}
