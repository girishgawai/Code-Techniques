package bitmasking;

public class Magic_Number {

	//	A magic number is defined as a number which can be
	//	expressed as a power of 5 or sum of unique powers
	//	of 5. First few magic numbers are 5, 25, 30(5+25),
	//	125, 130(125+5), ..
	//
	//	Write a fun to find the Nth Magic Number.
	//	Example :
	//	i/p - n=2
	//	o/p - 25
	//
	//	i/p - n=5
	//	o/p - 130

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int ans = magicNum(n);
		System.out.println(ans);
	}

	private static int magicNum(int n) {
		// TODO Auto-generated method stub
		int mult = 5;
		int ans = 0;
		
		while(n!=0)
		{
			if((n&1)!=0)
				ans = ans + mult;
			mult*=5;
			n>>=1;
		}
		
		return ans;
	}

}
