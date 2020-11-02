package Recursion;

public class CountDigits {
	
	public static void main(String[] args) {
		int num=9999999;
		System.out.println(counter(num));
	}

	private static int counter(int num) {
		if (num<10){return 1;}
		
		return 1+counter(num/10);
		
	}

}
