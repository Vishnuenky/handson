import java.util.*;


public class DivisibleByTwo {

	public static void main(String[] args) {
		
		List<Integer> a    = new ArrayList<Integer>();
		
		a.add(3);
		a.add(4);
		a.add(5);
		//ArrayList<Integer> arr2 = new ArrayList<Integer>();
		List<Integer> l = Arrays.asList(3,3,33,21,1);
		
		boolean result = a.stream().anyMatch(x->x%2==0);
		
		//boolean result = l.stream().allMatch(x->x%2==0);
		if(result) {
			System.out.println("atleast one is divisible by 2");
		}else {
			{
				System.out.println("not divisible by 2");
			}
		}
	}

}
