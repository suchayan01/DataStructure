package Sorting;

import java.util.Arrays;

public class BubbleSortOptimised {
	public static void main(String[] args) {
		int arr[]= {10,1,43,5,57,91,45,9,7};
		//int arr1[]= {10,4,43,5,57,91,45,9,7};
		sort(arr);
	}

	private static void sort(int[] arr) {
	  boolean swapped= true;
	  for(int pass=arr.length-1;pass>=0 && swapped ;pass--) {
		  swapped=false;
		  for(int i=0;i<pass;i++) {
			  if(arr[i]>arr[i+1]) {
				  arr[i]^=arr[i+1];
				  arr[i+1]^=arr[i];
				  arr[i]^=arr[i+1];
				  swapped=true;
			  }
		  }
	  }
	  
	  System.out.println(Arrays.toString(arr));
		
	}

}
