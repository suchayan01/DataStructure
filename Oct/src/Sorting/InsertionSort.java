package Sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {10,1,43,5,57,91,45,9,7};
		
		sort(arr);
	}

	private static void sort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int j=i-1 , temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}

}
