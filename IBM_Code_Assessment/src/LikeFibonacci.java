import java.util.Scanner;

public class LikeFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();//1st page
	    int b = scan.nextInt();//2nd page
	    int c = scan.nextInt();//Final count of page--find how many lines it will have it final page
	    int arr[]=new int[c];
	    if(a<=0 || a>b ||b<=0 ){
	        System.out.println("invalid input");
	    }
	    else{
	        arr[0]=a;
	        arr[1]=b;
	        for(int i=2;i<c;i++){
	            arr[i]=b+a;
	            a = b;
	            b = arr[i];
	        }
	        System.out.println(arr[c-1]); 
	    }

	}

}
