package Revision;

public class Subsets {
	public static void setsOfString(String s,String curr,int index){
		if(index==s.length()) {
			System.out.print(curr+" ");
			return;
		}
		
		setsOfString(s, curr, index+1);
		setsOfString(s, curr+s.charAt(index), index+1);
	}
	public static void main(String[] args) {
		String s="ABC";
		setsOfString(s, "", 0);
		
	}

}
