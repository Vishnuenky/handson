import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Pr {

	public static void main(String args[]) {
		
		List<Integer> l = Arrays.asList(1,2,3,4,4,11,4,21,21,21,12,1,10);
		
		Set<Integer> s = new HashSet<Integer>();
		List<Integer> ss =l.stream().filter(e->!s.add(e)).collect(Collectors.toList());
		
		System.out.println(ss);
		
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> sss =l.stream().filter(e->!s1.add(e)).collect(Collectors.toSet());
		
		System.out.println(sss);
		
		
	}

}
