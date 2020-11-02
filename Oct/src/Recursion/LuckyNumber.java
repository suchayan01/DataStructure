package Recursion;

import java.util.ArrayList;

public class LuckyNumber {
static int counter = 2;
    
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here
       ArrayList<Integer> arr= new ArrayList<>();
       for(int i=0;i<n+1;i++) {
    	   arr.add(i);
       }
       
       recurseDel(arr,counter); 
        
        return false;
    }
	private static void recurseDel(ArrayList<Integer> arr, int counter2) {
		while(counter2>0) {
			for(int i=0;i<arr.size();i++) {
//				if()
			}
		}
		
	}
	public static void main(String[] args) {
		isLucky(19);
	}

}
