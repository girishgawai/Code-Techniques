package recursion;

import java.util.Scanner;

public class Dices_Throw_Show_Faces_AND_CountIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n = 3;									// 3 dice hai total
		int n=sc.nextInt();
		// max possibllity kya rhegi..?? Ek toh 1st face gire ya 2nd ya fir 3rd
//		int max = 4;				// jaada se jaada unki sum itni aani chahiye.. (Que) isse bdi nhibhini chahiye na isse cum
									// itni jiski v sum hogi unko print kro
		int max=sc.nextInt();
		
		System.out.println("Total Possible Faces to become sum==4:");
		diceThrowCShowFaces(0, max, "", n);
		// 'N' dices thrown having 'N' faces.. tell the faces which makes sum==4
		
		System.out.println("\n Total Possible outcomes:");
		
		int sum = diceThrowCalculateTotalFaces(0, max, "", n);
		// 'N' dices thrown to calculate how many total possible times the sum of faces will becomes == 4
		System.out.println(sum);
	}

	// to show the faces
	private static void diceThrowCShowFaces(int curr, int max, String ans, int totalDice) {
		// TODO Auto-generated method stub
		if(curr==max)
		{
			System.out.println(ans);
			return;
		}
		
		if(curr>max)
			return;
		
		for (int dice = 1; dice <= totalDice; dice++) {
			diceThrowCShowFaces(curr+dice, max, ans+dice, totalDice);
		}
//		diceThrowCShowFaces(curr+1, max, ans+1, totalDice);	
//		diceThrowCShowFaces(curr+2, max, ans+2, totalDice);	
//		diceThrowCShowFaces(curr+3, max, ans+3, totalDice);
		
	}
	
	//to calculate thesum if faces sum==4
	private static int diceThrowCalculateTotalFaces(int curr, int max, String ans, int totalDice) {
		// TODO Auto-generated method stub
		if(curr==max)
		{
//			System.out.println(ans);
			return 1;
		}
		
		if(curr>max)
			return 0;
		
		int count=0;								// it will store the count (where the faces sum will be == 4(max)
														// this will store the count value for all diff-diff stacks frames and add it
		for (int dice = 1; dice <= totalDice; dice++) {
			count= count + diceThrowCalculateTotalFaces(curr+dice, max, ans+dice, totalDice);
		}
//		int d1 = diceThrowCalculateTotalFaces(curr+1, max, ans+1, totalDice);	
//		int d2 = diceThrowCalculateTotalFaces(curr+2, max, ans+2, totalDice);	
//		int d3 = diceThrowCalculateTotalFaces(curr+3, max, ans+3, totalDice);
		
//		return d1+d2+d3;
		
		return count;
	}

}
