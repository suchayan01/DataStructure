package Sorting;

import java.util.Arrays;

public class MergeSort {
	static int arrTemp[]= new int[8];
	public static void main(String[] args) {
		int[]arr= {4,5,3,1,7,0,4,9};
		sorted(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	 static void sorted(int[] arr, int lb, int up) {
		if(lb<up) {
		int mid=(up+lb)/2;
		sorted(arr,lb,mid);
		sorted(arr,mid+1,up);
		merge(arr,lb,mid,up);
		}
		
		
	}
	
	static void merge(int arr[],int lb,int mid,int up){
		
		
		int i=lb,j=mid+1,k=lb;
		
		while(i<=mid && j<=up) {
			if(arr[i]<=arr[j]) {
				arrTemp[k]=arr[i];
				i++;
			}
			else {
				arrTemp[k]=arr[j];
				j++;
			}
			k++;
			
		}
				  if(i>mid) 
				  { 
					  while(j<=up) {
						  arrTemp[k]=arr[j];
						  j++;
						  k++; 
						  } 
					  } 
				  else {
					  while(i<=mid) { 
						  arrTemp[k]=arr[i]; 
						  i++; 
						  k++; 
						  } 
		  }
		 
		//System.out.println("111111111"+Arrays.toString(arrTemp));
		for(i=0;i<=up;i++) {
			arr[i]=arrTemp[i];
		}
		
		
		
	}

}
