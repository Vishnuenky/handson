import java.util.*;
public class convertingHashmapToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(1, 7);
		hm.put(2,6);
		hm.put(3, 6);
		
		
		//we can convert hashmap only to ArrayList, not to array. we will get ArrayStoreException.
		Set<Map.Entry<Integer,Integer>> en = hm.entrySet();
		System.out.println("This is Entryset"+en);
		
		ArrayList<Map.Entry<Integer,Integer>> l = new ArrayList<Map.Entry<Integer,Integer>>(en);
		System.out.println("This is ArrayList"+l);
		//System.out.println(l.toArray());// -- we cant convert list having entryset value to array(we will get runtime exception--- we can only split keyset and value in hashmap and convert it into arraylist and then to array
	}

}
