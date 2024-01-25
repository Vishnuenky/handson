import java.util.Stack;

public class Ds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		String a = "";
		while(!s.isEmpty()){
            a = a + Integer.toString(s.pop());
        }
		//a=a+s.pop();
		System.out.println(a);
		//System.out.println(!s.isEmpty());

	}

}
