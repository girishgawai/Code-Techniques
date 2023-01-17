package dp.tough_qps;

import java.util.Arrays;

public class Matrix_Chain_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 3, 5, 1 };		// yeh array me dimensions diye hai matrix ke 4 matrix hai-->4x2, 2x3, 3x5,..
// we have to multiply the matrixes such that the order should be maintain of resultant amtrix ie. 4x1 with Minimum no of mult operations
		
		int ans = MCM(arr, 0, arr.length-1);
		System.out.println(ans);
		
		int[][] dp = new int[arr.length][arr.length];
		for(int[] a : dp)
			Arrays.fill(a, -1);
		int ansDP = MCM_DP(arr, 0, arr.length-1,dp);
		System.out.println(ansDP);
	}

	private static int MCM(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		// base case.. jb ek hi matrix bach jaye toh uska mult timings 0 rhega.. kisi se mult krne koi dusra matrix bcha hi nhi
		if(i+1==j)
			return 0;
		
		int minMult = Integer.MAX_VALUE;
		for (int k = i+1; k < j ; k++) {		// jha se start hai usse ek se aage ka hi bheje ge na next matrix k liye
			int fs = MCM(arr, i, k);					// first matrix side ka mult no of times me
			int ss = MCM(arr, k, j);					// first matrix side ke end se hi next wala matrixes ka mult no of times me
			
			// ab self ka timings mtlb resultant.. left ka and rt ka.. mtlb frst side & scnd side matrix ka mult ke total outocomes possible
			// [2x3][3x4] ==> m1 ka col x m2 ka col x m1 ki row --> 2x3x4
			int self = arr[i] * arr[j] * arr[k];											// resultant matrix of it
			minMult = Math.min(minMult, fs+ss+self);
		}
		
		return minMult;
	}

	/*************** USING DP TOP TO BOTTOM ***************/
	private static int MCM_DP(int[] arr, int i, int j, int[][] dp) {
		// TODO Auto-generated method stub
		// base case.. jb ek hi matrix bach jaye toh uska mult timings 0 rhega.. kisi se mult krne koi dusra matrix bcha hi nhi
		if(i+1==j)
			return 0;
		
		if(dp[i][j]!=-1)
			return dp[i][j];
		int minMult = Integer.MAX_VALUE;
		for (int k = i+1; k < j ; k++) {		// jha se start hai usse ek se aage ka hi bheje ge na next matrix k liye
			int fs = MCM_DP(arr, i, k, dp);					// first matrix side ka mult no of times me
			int ss = MCM_DP(arr, k, j, dp);					// first matrix side ke end se hi next wala matrixes ka mult no of times me
			
			// ab self ka timings mtlb resultant.. left ka and rt ka.. mtlb frst side & scnd side matrix ka mult ke total outocomes possible
			// [2x3][3x4] ==> m1 ka col x m2 ka col x m1 ki row --> 2x3x4
			int self = arr[i] * arr[j] * arr[k];											// resultant matrix of it
			minMult = Math.min(minMult, fs+ss+self);
		}
		
		return dp[i][j] = minMult;
	}
}
