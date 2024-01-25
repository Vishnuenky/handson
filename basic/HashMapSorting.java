import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(4, "four");
		hm.put(1, "one");
		hm.put(2, "one");
		hm.put(3, "three");
		hm.put(10,"ten");
		hm.put(7, "seven");
		System.out.println(hm);//O/p will be random order
		
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		Set<Map.Entry<Integer,String>> s = hm.entrySet();
		for(Entry<Integer, String>en:s) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(4, "four");
		lhm.put(1, "one");
		lhm.put(2, "one");
		lhm.put(3, "three");
		lhm.put(10,"ten");
		lhm.put(7, "seven");
		System.out.println(lhm);//O/p will be insertion order
		
		TreeMap<Integer,String> thm=new TreeMap<Integer,String>();
		thm.put(4, "four");
		thm.put(1, "one");
		thm.put(2, "one");
		thm.put(3, "three");
		thm.put(10,"ten");
		thm.put(7, "seven");
		System.out.println(thm);//O/p will be sorted order
	}

}
