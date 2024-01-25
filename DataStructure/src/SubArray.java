import java.util.ArrayList;

public class SubArray {

			// TODO Auto-generated method stub/// technoname site
		public static void main(String[] args) {
			int[] a = {1,2,3,7,5};
			int i=0;
			int s=12;
			ArrayList<Integer> arr = subarraySum(a,5,s);
			System.out.println(arr);
		}
		public static ArrayList<Integer> subarraySum(int[] a, int n, int s) {
	        int i, j;
	        int sum = 0;
	        int start=0;
	        ArrayList<Integer> al = new ArrayList<>();

	        for (i = 0; i < n; i++) {
	            
	                sum=sum+a[i];
	                while(sum>s){
	                    sum=sum-a[start];
	                    start++;
	                }
	                if(sum==s && s!=0){
	                    al.add(start+1);
	                    al.add(i+1);
	                    return al;
	                }
	            
	    }
	    al.add(-1);
	    return al;
	}
	
	
		  
		   
		

}


