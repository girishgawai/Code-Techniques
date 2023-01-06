package dp__dynamic_programming;

/*
Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for same 
inputs, we can optimize it using Dynamic Programming. The idea is to simply store the results of subproblems, so that we do not have to 
re-compute them when needed later.

At any stage if we needed the previous experience/solutuion at current point we store it and used the store solution now instead of again
solving it.
*/

public class Fibonacci {
	
	public static void main(String[] args) {
		int n = 8;
		
		System.out.println(fib(n));												// using plain recursion
		
									/* Using Dynamic Programming [DP] */
		int[] dp = new int[n+1];
		System.out.println(fibTD(n, dp));								// using Top Down Approach --> Memorization

		dp = new int[n+1];
		System.out.println(fibBU(n, dp));								// using Bottom Up Approach --> Iterative way
	}

	private static int fibBU(int n, int[] dp) {						// Bottom Up Approach --> Iterative way
		// TODO Auto-generated method stub
		dp[0] = 0;									// Base Case
		dp[1] = 1;									// Base Case
		
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];					// ulte ayege find krte isliye - liya hai.. means prsnt se 1 phle aise update krege dp[] me values
		}
		
		return dp[dp.length-1];							// dp[] ke last index pe hi fibonacii num ki value ans hoga
	}

	private static int fibTD(int n, int[] dp) {						// Top Down Approach --> Memorization
		// TODO Auto-generated method stub
		if(n==0 || n==1)
			return n;
		
														// default dp[] me sare 0 hi filled hai
		if(dp[n]!=0)		// agr dp[] array me uss loc pe already koi value filled ho other than 0 toh mtlb uss position ka fibo nikala hai
			return dp[n];			/* DP Apply kia */
		
		int f1 = fibTD(n-1, dp);
		int f2 = fibTD(n-2, dp);
		
		return dp[n] = f1+f2;				// memorize kia ans ko iske array me dp[] ke
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
			return n;
		
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		
		return f1+f2;
	}

}
