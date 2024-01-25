import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,1,3};
		int len = arr.length;
		System.out.println(len);
		List<Integer> l = Arrays.asList(2,3,4,1,3);
		List<Integer> ll = l.stream().distinct().collect(Collectors.toList());
		
		System.out.println(ll);
		
		int actual_sum=(len*(len+1))/2;
		System.out.println(actual_sum);
		
		int current_sum = ll.stream().reduce((a,b)->a+b).get();
		System.out.println(current_sum);
		
		int missing_num = actual_sum - current_sum;
		
		System.out.println(missing_num);
		
	}

}
