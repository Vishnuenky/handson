import java.util.*;
public class BinaryEquivalentDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "011000100000110100100000";
		if(str.length()%4!=0){
			
			System.out.println("Invalid String");
			
		}else {
			
			String[] s={"0","1","2","3","4","5","6","7","8","9","+","-","*","/"};
			
			for(int i=0;i<str.length();i=i+4) {
				//System.out.println(str.substring(i,i+4));
				String bi = str.substring(i,i+4);
				int decimal = Integer.parseInt(bi,2);
				String p=s[decimal];
				if(p=="+"||p=="-"||p=="*"||p=="/") {
					System.out.println();
					System.out.println(p);
				}else {
					System.out.print(p);
				}
			}
		}

	}

}
