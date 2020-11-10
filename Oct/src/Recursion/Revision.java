package Recursion;

public class Revision {
	public static void main(String[] args) {
		String s="ABC";
		int index=0;
		allSubsets(s ,"",index);
	}

	private static void allSubsets(String s,String curr,int index) {
		if(index==s.length()) {
			System.out.println(curr);
			return;
		}
		allSubsets(s, curr, index+1);
		allSubsets(s, curr+s.charAt(index), index+1);
		
	}

}
