package Recursion;

public class TowerOfHanoi {
	public static void main(String[] args) {
		int discs=3;
	 towerSteps(discs,'A','B','C');
	}

	private static void  towerSteps(int discs,char src,char aux,char dest) {
		// TODO Auto-generated method stub
		if(discs==1) {
			System.out.println("-Move 1 from "+src+" to "+dest);
			return;
		}
		
		towerSteps(discs-1, 'A', 'C', 'B');
		System.out.println("Move "+discs+" from"+src+" to "+dest);
		towerSteps(discs-1, 'B', 'A', 'C');
	}

}
