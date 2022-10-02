/*
 *  You are given unlimited source of coins (num of coins) of Rs 2,3,4,5,6,7,8 & 9. You have to form the total sum of Rs 1000
 *   Form all the possible Combinations without repeating/permutation arrrangements, which can be form to generate the given Amount.
 */

package recursion;

import java.util.Scanner;

public class Coins_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int tnc=sc.nextInt();
		int[] coins = new int[tnc];
		for (int i = 0; i < coins.length; i++) {
			coins[i]=sc.nextInt();
		}
		
		printCombinations(coins,tnc,amount,"",0);
	}

	public static void printCombinations(int[] coins, int tnc, int amount, String ans, int last)
	{
		if(amount==0)
		{
			System.out.println(ans);
			return;
		}
		
			//(i jha se phle call aaya phle frame ka whi se next call chla rha hai last se (i))
		for (int i = last; i < coins.length; i++) {		//for performing combinations to not have permutative combaination ans(repeative)
			if(coins[i]<=amount)
				printCombinations(coins, tnc, amount-coins[i], ans+coins[i], i);	//hm next call yhi se chlega jha se LAST frame ka 
//(last frame a call i se chlla.. next ka v yhi se chlega isi 'i' se)	// call chla(iss frame ka call chla whi se next frame ka call chlega
		}
	}
}
