package Sorting;

import java.util.Arrays;

public class Shellsort {
	public static void main(String[] args) {
		int arr[]= {10,4,43,5,57,91,45,9,7};
		sort(arr);
	}

	private static void sort(int[] arr) {
		int n = arr.length;
		for(int gap=n/2;gap>=1;gap=gap/2) {
			for(int j=gap;j<n;j++) {
				for(int i=j-gap;i>=0;i-=gap) {
					if(arr[i+gap]<arr[i]) {
						swap(arr,i+gap,i);
					}
					else {
						break;
					}
				}
			}
		}
		
		System.out.println("----------------------------");
		System.out.print(Arrays.toString(arr));;
		
	}

	private static void swap(int[] arr, int i, int j) {
		arr[i]^=arr[j];
		arr[j]^= arr[i];
		arr[i]^=arr[j];
		
	}

}
