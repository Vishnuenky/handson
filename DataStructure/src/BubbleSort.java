import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,1,5,2,8,3,5,11,6};
	    int temp=0;
	    
	    int j =1;
		while (j < a.length) {
			for (int i = 0; i < a.length - j; i++) {

				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
				
			}
			j++;
		}
	    
	    System.out.println(Arrays.toString(a));

	}

}
