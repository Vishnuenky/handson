import java.util.stream.IntStream;

public class ReverseStringAndVowelReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Language";
		
		char[] ch = s.toCharArray();
		
		/*
		 * IntStream.range(0,ch.length) .mapToObj(i->ch[(ch.length-1)-i])
		 * .forEach(System.out::println);
		 * 
		 * StringBuffer sb = new StringBuffer(s); 
		 * sb=sb.reverse();
		 * System.out.println(sb);
		 */
		int count=0;
		StringBuffer sb = new StringBuffer();
		
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
				sb.append(ch[i]);
			}else {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer();
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)=='A'||sb.charAt(i)=='E'||sb.charAt(i)=='I'||sb.charAt(i)=='O'||sb.charAt(i)=='U'||sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u') {
				
				sb1.append(count);
				count--;
			}else {
				sb1.append(sb.charAt(i));
			}
		}
		System.out.println(sb1);
		

	}

}
