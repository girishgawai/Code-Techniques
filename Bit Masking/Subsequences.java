package bitmasking;

public class Subsequences {
	/****** We can form the Subsequences using Recursion ******/
	/** But using Bit Masking also it can be form -- Best Way **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";

		int p = str.length();
		//		forming the all subsequences using binary from 1 to the length of that Given String --> 2^(len of str) will form all the subseq
		for(int i = 0; i < (1<<p); i++)
		{
			formSubSeq(str, i);
//			print_pattren(i,str);
		}
	}

	private static void formSubSeq(String str, int i) {
		// TODO Auto-generated method stub
		String ans = new String();
		for (int j = 0; j < str.length(); j++) 
		{
			if((i&1) != 0)
			{
				ans = ans + str.charAt(j);
			}
			i = i>>1;
		}
		System.out.println(ans);
	}

	private static void print_pattren(int i, String str) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i != 0) {

			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			i >>= 1;
		}
		System.out.println();

	}
}
