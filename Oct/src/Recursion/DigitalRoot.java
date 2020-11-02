package Recursion;

public class DigitalRoot {
	public static int digitalRoot(int n)
    {
        // add your code here
        if (n<10){
            return n;
        }
        return digitalRoot(sumOfDigits(n));
    }
    
    public static int sumOfDigits(int num){
        if(num<10){
            return num;
        }
        
        return num%10+sumOfDigits(num/10);
    }
	public static void main(String[] args) {
		int num=11;
		System.out.println(digitalRoot(num));
		
		
	}

}
