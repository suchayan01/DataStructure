package Sorting;

import java.util.Arrays;

public class Bubble {
	static void sort(int arr[]) {
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------");
		
		for(int pass=arr.length-1;pass>=0;pass--) {
			for(int i=0;i<pass;i++) {
				if(arr[i]>arr[i+1]) {
					arr[i]^=arr[i+1];
					arr[i+1]^=arr[i];
					arr[i]^=arr[i+1];
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("Post Ordering in Ascending order");
		System.out.println("------------------------------");
		System.out.println(Arrays.toString(arr));
	}
	 public static void main(String[] args) {
		int arr[]= {10,1,43,5,57,91,45,9,7};
		int arr1[]= {10,4,43,5,57,91,45,9,7};
		sort(arr1);
	}
}
