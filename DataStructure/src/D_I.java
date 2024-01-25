import java.util.Stack;

public class D_I {

	public static void main(String[] args) {
		String s = "IIDDIIID";
		String ss = printMinNumberForPattern(s);
		System.out.println(ss);
	}
	public static String printMinNumberForPattern(String s){      
        String ans = "";
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for(int i=0;i<s.length();i++){
            st.push(num);
            num++;
            if(s.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    ans = ans + Integer.toString(st.pop());
                }
            }
        }
        st.push(num);
        while(!st.isEmpty()){
                    ans += Integer.toString(st.pop());
                }
        return ans;
    }
	

}
