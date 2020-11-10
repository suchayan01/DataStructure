package Recursion;

import java.util.ArrayList;

public class LuckyNumber {
static int counter = 2;
    
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here
       ArrayList<Integer> arr= new ArrayList<>();
       for(int i=1;i<n+1;i++) {
    	   arr.add(i);
       }
       System.out.println(arr);
       int start =2;
       recurseDel(arr,start); 
       //System.out.println(arr);
        if(arr.contains(Integer.valueOf(n))) {
        	return true;
        }
        return false;
    }
	private static void recurseDel(ArrayList<Integer> arr,int start) {
		System.out.println(counter+"---st"+start);
		if(counter==0) {
			//System.out.println(start+"----start");
			System.out.println(counter);
			return;
		}
		for(int i=0;i<arr.size()-start;i++) {
			System.out.println(start+i-1);
		arr.remove(start+i-1);
		}
		System.out.println(arr);
		counter--;
		recurseDel(arr,start+1);
		
	}
	public static void main(String[] args) {
		
		System.out.println(isLucky(5));
	}

}
