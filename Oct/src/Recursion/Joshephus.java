package Recursion;

public class Joshephus {
	public static void main(String[] args) {
		int people=5, k=3;
		System.out.println(living(people,k));
	}

	private static int living(int people, int k) {
		if(people==1) {
			return 0;
		}
		return (living(people-1,k)+k)%people;
		
	}

}
