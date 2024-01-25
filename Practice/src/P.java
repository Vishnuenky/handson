import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class P {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		l.add(3);
		Map<String, List<Integer>> hm = new HashMap<String, List<Integer>>();
		hm.put("vd",new ArrayList<Integer>());
		hm.get("vd").addAll(l);
		hm.put("dd", new ArrayList<Integer>());
		hm.get("dd").addAll(l);
		
		System.out.println(hm);
		
		Map<String, Integer> hmm = new HashMap<String, Integer>();
		
		List<Map.Entry<String, Integer>> ll = new ArrayList<>(hmm.entrySet());
		System.out.println(ll);
		
	}

	
	
	    
	
	

}
