
public class Permutations {
	
	public static void perm(String inp,String curr,int index) {
		//System.out.println("I need it");
		
		if(index==inp.length()) {
			System.out.println(curr);
			return;
		}
		
		perm(inp, curr, index+1);
		perm(inp, curr+inp.charAt(index), index+1);
	}
public static void main(String[] args) {
	String s="ABC";
	perm(s," ",0);
}
}
