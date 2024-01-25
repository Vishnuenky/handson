import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.function.Function;


public class practise {

	//iNTERCERT OF TWO ARRAY
	public static void main(String args[]) {
		
	String str = "vishnuvishnu";
	Map<String,Long> m = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(m);	
	
	
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	String st = "abcdabcd";
	char[] c = st.toCharArray();
	for(Character x:c) {
		if(!hm.containsKey(x)) {
			hm.put(x,1);
		}else {
			hm.put(x,hm.get(x)+1);
		}
	}
	
	System.out.println(hm);
	
	//(Entry<Character,Integer> e:hm.entrySet())
	for(Entry<Character, Integer> e:hm.entrySet()) {
		String s =e.getKey()+""+e.getValue();
		System.out.print(s+" ");
		}
	
	}
}
		
		
	


