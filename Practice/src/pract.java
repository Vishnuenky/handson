import java.util.*;
import java.util.stream.Collectors;

public class pract {

	public static void main(String[] args) {
		String str ="Codding is very easy";
		System.out.println(str.length());
		String[] sarr = str.split(" ");
		
		StringBuffer sb = new StringBuffer();
		int l = sarr.length;
		for(int i =l-1;i>=0;i--) {
			sb.append(sarr[i]+" ");
		}
		//System.out.println(sb.toString());//we can also directly convert this to string
		System.out.println(sb.toString());
		System.out.println(sb.length());
		String ss = sb.toString().strip();
		
		
		System.out.println(ss.length());//here we can get the same length as input string
	}

	}


