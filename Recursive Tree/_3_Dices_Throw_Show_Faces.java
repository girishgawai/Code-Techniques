package recursion;

import java.util.Scanner;

public class _3_Dices_Throw_Show_Faces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n = 3;									// 3 dice hai total
		// max possibllity kya rhegi..?? Ek toh 1st face gire ya 2nd ya fir 3rd
		int max = 4;				// jaada se jaada unki sum itni aani chahiye.. (Que) isse bdi nhibhini chahiye na isse cum
									// itni jiski v sum hogi unko print kro

		System.out.println("Total Possible Faces to become sum==4:");
		diceThrowCShowFaces(0, max, "");
		// 3 dices thrown having 3 faces.. tell the faces which makes sum==4
		
		System.out.println("\n Total Possible outcomes:");
		
		int sum = diceThrowCalculateTotalFaces(0, max, "");
		// 3 dices thrown to calculate how many total possible times the sum of faces will becomes == 4
		System.out.println(sum);
	}

	// to show the faces
	private static void diceThrowCShowFaces(int curr, int max, String ans) {
		// TODO Auto-generated method stub
		if(curr==max)
		{
			System.out.println(ans);
			return;
		}
		
		if(curr>max)
			return;
		
		diceThrowCShowFaces(curr+1, max, ans+1);	
		diceThrowCShowFaces(curr+2, max, ans+2);	
		diceThrowCShowFaces(curr+3, max, ans+3);
		
	}
	
	//to calculate thesum if faces sum==4
	private static int diceThrowCalculateTotalFaces(int curr, int max, String ans) {
		// TODO Auto-generated method stub
		if(curr==max)
		{
//			System.out.println(ans);
			return 1;
		}
		
		if(curr>max)
			return 0;
		
		int d1 = diceThrowCalculateTotalFaces(curr+1, max, ans+1);	
		int d2 = diceThrowCalculateTotalFaces(curr+2, max, ans+2);	
		int d3 = diceThrowCalculateTotalFaces(curr+3, max, ans+3);
		
		return d1+d2+d3;
	}

}
