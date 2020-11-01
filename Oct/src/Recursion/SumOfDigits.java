package Recursion;

public class SumOfDigits {
	public static int sum(int n) {
		
		if(n>10) {
			return n%10+sum(n/10);
		}
		else {
			return n;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(sum(253));
	}

}
