package recursion;

import java.util.Scanner;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int disc = sc.nextInt();
		String source = "A";
		String helper = "B";
		String destination = "C";
		
		moveDisc(disc, source, helper, destination);
	}

	private static void moveDisc(int disc, String src, String hlp, String des) {
		// TODO Auto-generated method stub
		if(disc==0)
			return;
		
		moveDisc(disc-1, src, des, hlp);
		System.out.println("moved "+ disc+ "th from "+src+" to "+ des);
		moveDisc(disc-1, hlp, src, des);
		
	}

}
