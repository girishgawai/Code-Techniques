/*
 *  You are given unlimited source of coins (num of coins) of Rs 2,3,4,5,6,7,8 & 9. You have to form the total sum of Rs 1000
 *   Form all the possible Permutations which can be form to generate the given Amount.
 */
package recursion;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = { 2, 3, 5, 6 };					// types of coins  --> but coin source is unlimited i.e. can pick infinite coins
		int amount = 10;
		
		Printanswer(coin, amount, "");
	}

	private static void Printanswer(int[] coin, int amount, String ans) {
		// TODO Auto-generated method stub
		if(amount==0)
		{
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < coin.length; i++) {
			if(coin[i]<=amount)
				Printanswer(coin, amount-coin[i], ans+coin[i]);
		}
		
	}

}
