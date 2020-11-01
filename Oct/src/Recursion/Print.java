package Recursion;

public class Print {
	static void print(int n) {
		if(n<0){
            return;
        }
        else{
            System.out.print(Integer.toString(n)+' ');
            print(n-1);
        }
	}
	
	public static void main(String[] args) {
		print(10);
	}
}
