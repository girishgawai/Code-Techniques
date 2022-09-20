package recursive_tree;

import java.util.Scanner;

public class TossTheCoin_No_HEAD_conigeousRepeatation {

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

																			// first time me jb string empty hogi tb chlega YA FIR 
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')			 		// jb last element in ans string 'H' nhi hoga tb chlega
		{
			tossIt(n-1, ans+"H");
		}
		
		tossIt(n-1, ans+"T");
	}

}
