import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n=5;
		int temp=0;  //0 1 1 2 3 5 8
		
		
		temp=n1+n2;
		
		for(int i=1;i<=5;i++) {
			System.out.print(temp+" ");
			n1=n2;
			n2=temp;
			temp=n1+n2;
			
		}
		
		
		String s = Stream.iterate(new int[] {0,1}, t->new int[] {t[1],t[0]+t[1]})
				.limit(5)
				.map(t->t[0])
				.map(String::valueOf)
				.collect(Collectors.joining(" "));
		
		System.out.print(s);

	}

}
