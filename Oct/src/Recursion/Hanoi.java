package Recursion;

class Hanoi {
    
	public  void toh(int N, int from, int to, int aux) {
        long moves = 0L;
        if (N == 1) {
        	System.out.println("--move disk " + N + " from rod " + from +
                    " to rod " + to);
        	moves++;
        	return;
        	
        }
            // recursive call to move top disk from "from" to aux in current call
            toh(N - 1, from, aux, to);
            System.out.println("--move disk " + N + " from rod " + from +
                               " to rod " + to);
            
            // increment moves
            moves++;
            
            // recursive call to move top disk from aux to "to" in current call
            toh(N - 1, aux, to, from);
//        }
       System.out.println (moves);
    }
    public static void main(String[] args) {
    	Hanoi h= new Hanoi();
    	h.toh(2, 1, 3, 2);
	}
}