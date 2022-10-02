/* You have to set the given all the queens in in all possible blcoks individually, so that they can be set into all possible
 * arrangements without repeating (Non-Permutation). Two queens cannot be sit on same block at same time.
 */

package recursion;

import java.util.Scanner;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tnq=sc.nextInt();								// total number of queens
		int ttlblcks=sc.nextInt();
		boolean[] blocks = new boolean[ttlblcks];

		printCombinations(blocks,tnq,0,"",0);					//total blocks[], total queens, queens set till now, for stroing answer
	}

	private static void printCombinations(boolean[] blocks, int tnq, int queensplaced, String ans, int last) {
		// TODO Auto-generated method stub
		if(tnq==queensplaced)
		{
			System.out.println(ans);
			return;
		}
			
									
		for (int j = last; j < blocks.length; j++) 			// Combination bnana hai and repeatations/permutations nhi chlte isme
		{										// and source limited hai(No. of Blocks) isliye hm next pickup last wale se ek se aage se lena rhta
			if(blocks[j]==false)
			{
				blocks[j]=true;				// yeh chnages real data frame me hore hai arguments me nhi.. so next time jb return 
													// ayega tb v iss frame me eh changes rhegee hi
				printCombinations(blocks, tnq, queensplaced+1, ans+"B"+j+"Q"+queensplaced, j+1);	//yeh changes sirf arguments me hore real data me nhi
				blocks[j]=false;		//bcaz changes original data me hua tha nd Recursion can't undo it so hme undo krna pda
			}									// isko Back-Tracking bolte hai
		}

	}

}
