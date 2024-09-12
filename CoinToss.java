package recursive_tree;

import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		tossIt(n, new String());

	}

	private static void tossIt(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			System.out.println(ans+"  ");
			return;
		}

		tossIt(n-1, ans+"H");
		tossIt(n-1, ans+"T");
	}

}
