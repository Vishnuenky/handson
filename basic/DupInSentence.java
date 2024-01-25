import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DupInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vishnu Devi manivel shri Devi is is a good girl";
		String s1[] =str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(String x:s1) {
			if(!hm.containsKey(x)) {
				hm.put(x,1);
			}else {
				hm.put(x,hm.get(x)+1);
			}
		}
		
		System.out.println(hm);
		
		Set<Map.Entry<String,Integer>> entry = hm.entrySet();// converting hashmap to entryset
		for(Entry<String, Integer> en:entry) {
			if(en.getValue()>1) {
				System.out.println(en.getKey()+" is duplicated");
			}
		}
	}

}
