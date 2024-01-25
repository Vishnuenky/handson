import java.util.Arrays;
import java.util.HashSet;

public class removeDupInArrayByHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {11,2,3,4,6,6,4,11};
		HashSet<Integer> hs= new HashSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			hs.add(ar[i]);
		}
		System.out.println(hs);
		
		Integer[] a = new Integer[hs.size()]; //as like normal array ,for object array also we need to give size
		hs.toArray(a);   // cant convert  to int[] as toArray() will only return Object[] when converting hashset to Array
		System.out.println(a);// will print hashcode value of a[]
		
		System.out.println(Arrays.toString(a));//converting array to string and printing
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);// a[] value will be printed one by one
		}
		
		

	}

}
