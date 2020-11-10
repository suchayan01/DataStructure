package Sorting;

public class MergeSort {
	
	public static void main(String[] args) {
		int[]arr= {4,5,3,1,7,0,4,9};
		sorted(arr,0,arr.length);
	}

	 static int[] sorted(int[] arr, int lb, int up) {
		while(up>lb) {
		int mid=(up+lb)/2;
		sorted(arr,lb,mid);
		sorted(arr,mid+1,lb);
		merge(arr,lb,mid,up);
		}
		
		return arr;
	}
	
	static void merge(int arr[],int lb,int mid,int up){
		
	}

}
