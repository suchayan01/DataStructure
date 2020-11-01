package Recursion;



public class Subsets {
	
	public static void substrings(String inp,String curr,int index) {
		
		if(index==inp.length()) {
			System.out.println(curr+" ");
			return;
		}
		
		substrings(inp, curr, index+1);
		substrings(inp, curr+inp.charAt(index), index+1);
	}
	public static void main(String[] args) {
		String str="ABC";
		substrings(str, "",0);
	}

}
