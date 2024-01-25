import java.util.*;
public class MinimunLengthInMonsterGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//https://www.youtube.com/watch?v=9_R6xZpLqGc ---second video(Monster)
		
		Scanner sc= new Scanner(System.in);
		String str = sc.next(); //to get string without space
		System.out.println(str);
		
		
		/*
		 * String str = "word1, word2 word3@word4?word5.word6"; String[] arrOfStr =
		 * str.split("[, ?.@]+");
		 */
		
		//String[] s1 = s.split("$");--This symbols split is not working, so i replaced
		
		String s = str.replace("$","#");
		System.out.println(s);
		
		
		String[] s1 = s.split("[#@]+");
		System.out.println(Arrays.toString(s1));
		
		List<Integer> l = new ArrayList<Integer>();
		for(String a:s1 ) {
			Integer len = a.length();
			l.add(len);
		}
		
		System.out.println(l);
		
		int res = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(res);
		
	}

}
