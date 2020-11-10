package Revision;

public class Ropecust {
	public static void main(String[] args) {
		System.out.println(cuts(5,2,5,1));
	}

	private static int cuts(int rope, int x, int y, int z) {
		int size;
		if(rope<=0) {
			return -1;
		}
		
		 return Math.max(cuts(rope-x,x,y,z),Math.max(cuts(rope-y,x,y,z),cuts(rope-z,x,y,z)));
		
	}

}
