import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DupLetterInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		char[] c=str.toCharArray();
		int i =6;
		
		//different method of converting char array to string
		System.out.println(Arrays.toString(c));//here the array as a whole converted into string with "[]"
		String d=new String(c);
		//String d=c; --we cant do this
		System.out.println(d);
		
		String e = String.valueOf(c);
		System.out.println(e);
		
		//System.out.println(d.typeof()); -- java doesnt have typeof operator
		String f=String.valueOf(i);//converting int to string, we can convert any datatype to string by using valueOf
		System.out.println(f);
		
		
		String s2 = "name"+"name";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(Character x:c) {
			if(!hm.containsKey(x)) {
				hm.put(x,1);
			}else {
				hm.put(x,hm.get(x)+1);
			}
		}
		
		System.out.println(hm); 
		System.out.println(s2);
		

	}

}
