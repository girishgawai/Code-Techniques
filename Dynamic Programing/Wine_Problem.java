package dp.tough_qps;

public class Wine_Problem {
	
//	Given n wines in a row, with integers denoting the cost of each wine respectively. Each year you can sale the first or the last wine 
//	in a row. However, the price of wines increases over time. Let the initial profits from the wines be P1, P2, P3…Pn. In the Yth year, 
//	the profit from the ith wine will be Y*Pi. For each year, your task is to print “beg” or “end” denoting whether first or last wine 
//	should be sold. Also, calculate the maximum profit from all the wines.
//
//	Examples : 
//
//		Input: Price of wines: 2 4 6 2 5
//		Output: beg end end beg beg 
//		         64

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 1, 4 };
		
		int[][] dp = new int[arr.length][arr.length];
		System.out.println(maxProfit(arr, 0, arr.length-1, 1, dp));

//		System.out.println(maxProfit(arr, 0, arr.length-1, 1, 0));
	}
	
	
	public static int maxProfit(int[] arr, int i, int j, int year, int[][] dp)
	{
		if(i>j)
			return 0;
		
		if(dp[i][j]!=0)
			return dp[i][j];
		
		int sellFirst = maxProfit(arr, i+1, j, year+1, dp) + arr[i]*year;
		int sellLast = maxProfit(arr, i, j-1, year+1, dp) + arr[j]*year;
		
		return dp[i][j] =  Math.max(sellLast, sellFirst);
	}


	
	
//	public static int maxProfit(int[] arr, int i, int j, int year, int ans)
//	{
//		if(i>j)
//			return ans;
////		System.out.println(i+"   "+j);
//		int sellFirst = maxProfit(arr, i+1, j, year+1, ans + arr[i]*year);
//		int sellLast = maxProfit(arr, i, j-1, year+1, ans + arr[j]*year);
//		return Math.max(sellLast, sellFirst);
//	}

}
