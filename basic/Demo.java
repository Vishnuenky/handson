import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Demo {

	public static void main(String[] args) {
		String[] str = {"vishnu","devi","mani","vishnu","vel","venkat","shri","mani"};
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		for(String x:str) {
			if(!hm.containsKey(x)) {
				hm.put(x, 1);
			}
			else {
				hm.put(x,hm.get(x)+1);
			}
		}
		System.out.println(hm);
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		Set<String> keySet = hm.keySet();
		Collection<Integer> values = hm.values();
		ArrayList<String> listOfKeys = new ArrayList<String>(keySet);  // Converting keySet of hashmap to Arraylist
		//ArrayList<String> listOfKeys = new ArrayList<String>(hm.keySet());
		
		ArrayList<Integer> listOfValues = new ArrayList<>(values);  //Converting value of hashmap to Arraylist
		//ArrayList<Integer> listOfValues = new ArrayList<>(hm.values());
		
		System.out.println("listOfKeys"+listOfKeys);
		System.out.println(listOfValues); 
		
		String[] s = new String[listOfKeys.size()];
		listOfKeys.toArray(s);   //Converting Arraylist to array
		
		//System.out.println(listOfKeys.toArray(s)); //cant directly print the array should use for loop
		for(String x:s) {
			System.out.println(x);
		}
		
		
		List<String> a = new ArrayList<String>();// for our clarity, we can give list as classname for all ArrayList declaration 
		//ArrayList<String> a1 = new ArrayList<String>(); //-- here we cant put as ArrayList as classname
		a =	Arrays.asList(s);//Again converting Array to ArrayList
		//List<String> a = new ArrayList<String>(Arrays.asList(s)); -- we can also do like this
		System.out.println(a);
		
		for(Map.Entry<String,Integer> en:hm.entrySet()) {
			if(en.getValue()>1) {
				System.out.println(en.getKey()+"="+en.getValue());   // printing duplicate values
			}
		}
	}

}
