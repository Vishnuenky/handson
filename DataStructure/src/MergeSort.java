import java.util.Arrays;

public class MergeSort {
	
	//Time Complexity, Best and Worst case is O(N log N)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {40,10,30,100,90,111};
		
		sort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void sort(int[] arr, int L, int R) {
		if(L<R) {
			int mid = (L+R)/2;
			sort(arr,L,mid);
			sort(arr,mid+1,R);
			merge(arr,L,mid,R);
		}
		
	}

	private static void merge(int[] arr, int L, int mid, int R) {
		
		int l=mid-L+1;
		int r=R-mid;
		
		int[] LeftArray = new int[l];
		int[] RightArray = new int[r];
		
		int leftArrayStarting = L;
		int rightArrayStarting =mid+1;
		
		for(int i=0;i<l;i++) {
			LeftArray[i] = arr[leftArrayStarting+i];
		}
		
		for(int i=0;i<r;i++) {
			RightArray[i] = arr[rightArrayStarting+i];
		}
		
		int i=0,j=0,k=L;
		while(i<l && j<r) {
			
			if(LeftArray[i]<RightArray[j]) {
				arr[k]=LeftArray[i];
				i++;
				//k++;
			}else {
				arr[k]=RightArray[j];
				j++;
				//k++;
			}
			k++; //instead of incrementing k in if or else block , we can also increment here
		}
		while(i<l) {
			arr[k]=LeftArray[i];
			k++;
			i++;
		}
		while(j<r) {
			arr[k]=RightArray[j];
			k++;
			j++;
		}
		

	}

}
