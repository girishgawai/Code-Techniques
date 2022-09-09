package sliding_window_technique;
import java.util.Scanner;

//Subarray_Product_Less_Than_K
//Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
//
//		 
//
//Example 1:
//
//Input: nums = [10,5,2,6], k = 100
//Output: 8
//Explanation: The 8 subarrays that have product less than 100 are:
//[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
//Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
//Example 2:
//
//Input: nums = [1,2,3], k = 0
//Output: 0

public class Variable_Sliding_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int k =sc.nextInt();					// max product limit
		int ans= findSubArray(arr,k);
		System.out.println(ans);
	}

	private static int findSubArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int p=1;
		int count=0;
		
		while(ei<arr.length)
		{
			//window will grow
			p=p*arr[ei];
			
			//window ko shrink krega if needed
			while(p>=k && si<=ei)
			{
				p=p/arr[si];
				si++;
			}
			
		//calculate the operation--> maxm subarray ki lengths calculate krte jayege jinka product less than k hai
			count = count + (ei-si+1); // ei-si+1 ye (len/size) number of subarray jiskan product less than k hai
											// JEETNE TOTAL SUBARRAY BNEGE ISS ME USKA COUNT DEGA ei-si+1
			ei++;
		}
		
		return count;
	}
}
