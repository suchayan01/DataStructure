package Sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {10,1,43,5,57,91,45,9,7};
		int arr1[]= {10,4,43,5,57,91,45,9,7};
		sort(arr1);
	}

	private static void sort(int[] arr) {
		int index,temp;
		for(int i=0;i<arr.length;i++) {
			index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) {
					index=j;
					
				}
			}

			if(index!=i) {
			arr[i]^=arr[index];
			
			arr[index]^=arr[i];
			arr[i]^=arr[index];
			}

		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}

}
