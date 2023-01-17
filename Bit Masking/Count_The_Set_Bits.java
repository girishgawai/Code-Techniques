package bitmasking;

public class Count_The_Set_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		
		//O(n) count
		System.out.println(count(n));
		
		// More Optimised Way.. Jitne bits 1 Set hoge utne hi bar op hoga
		System.out.println(countFast(n));
	}

	// Lekin iss approach se hm har bit pe kajr check kr rhe ek tarh se.. traversing krke
	private static int count(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while(n!=0)
		{
			if((n&1)==1)
				count++;
			
			n = n>>1;
		}
		
		return count;
	}

	// Jitne Set bits hai.. sirf utne bar Operation hoga sp fast hai		
	private static int countFast(int n) {
		// TODO Auto-generated method stub
		int count = 0;								// khudki Bitwise Anding krna Khudse 1 cum ke sath and Store krdo use.. 
												// repeat the process n==0 hone tk k.. jitne bar hogi process utne Set bits rhege
		
		while(n!=0)
		{
			count++;
			n = (n-1)&n;
		}
		return count;
	}
}
