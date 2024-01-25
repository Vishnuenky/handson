import java.util.*;
import java.util.Map.Entry;


public class CompressedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a5g14c6b1a12b3";//"a31b2c5a1g9c2";
		
		TreeMap<Character,String> tm = new TreeMap<Character,String>();
		String b="";
		Character a='0'; //char a='0';//or  we can use Character also
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))){
				if(a!=0 && b!="") {
					if(!tm.containsKey(a)) {
					tm.put(a,b);
					a=0;
					b="";
					}else {
						int c=Integer.parseInt(tm.get(a))+ Integer.parseInt(b);
						tm.put(a,String.valueOf(c));
						a=0;
						b="";
					}
				}
				a = str.charAt(i);
			}else if(Character.isDigit(str.charAt(i))) {
				
				 b =b + str.charAt(i);
				 System.out.println(b);
			}
		}
		
		if(a!=0 && b!="") {
			if(!tm.containsKey(a)) {
			tm.put(a,b);
			a=0;
			b="";
			}else {
				int c=Integer.parseInt(tm.get(a))+ Integer.parseInt(b);
				tm.put(a,String.valueOf(c));
				a=0;
				b="";
			}
		}
		
		System.out.println(tm);
		
		StringBuffer sb = new StringBuffer();
		 for(Map.Entry<Character, String> e:tm.entrySet()) {
			sb.append(e.getKey());
			sb.append(e.getValue());
		 }
		 
		
		
		
		System.out.println(sb);
		
	}

}
