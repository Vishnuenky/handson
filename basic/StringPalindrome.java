
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mam";
		String sb="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			//sb.append(str.charAt(i)); if it is stringbuffer we can append, but but we cant compare by equals bcoz it wont check strng with string buffer(eventhoug sb.toString() not wholely convert the string buffer datatype to string, it just convert the the output to string
			sb=sb+(str.charAt(i));
		}
		sb.toString();
		System.out.println(str.hashCode());
		System.out.println(sb.hashCode());
		System.out.println(str.equals(sb));
		if(str.equals(sb)) {
			System.out.println(str+"is palindrome string");
		}else {
			System.out.println(str+"is not a palindrome string");
		}
	}

}
