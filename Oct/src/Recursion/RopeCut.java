package Recursion;

public class RopeCut {
	public static int cuts(int rope,int a,int b,int c) {
		if(rope==0) {
			return 0;
		}
		if(rope<0) {
			return -1;
		}
		
		int res= Math.max(Math.max(cuts(rope-a,a,b,c),cuts(rope-b,a,b,c)),cuts(rope-c,a,b,c));
		if(res==-1) {
			return -1;
		}
		return res+1;
		
	}
	public static void main(String[] args) {
		System.out.println(cuts(23,11,9,12));
	}
}
