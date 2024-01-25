import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arraylength=8;
		int pos=2;
		int[] a = {550,7,45,820,717,3,90,636};
		List<Integer> l = new ArrayList<Integer>();
		for(Integer e:a) {
			String s = String.valueOf(e);
			
			if(s.length()==3) {
				l.add(e);
			}
			
		}
		System.out.println(l);
		List<Integer> ll=l.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(ll.get(pos-1));
	}

}
