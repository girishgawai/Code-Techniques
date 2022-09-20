package recursive_tree;

import java.util.Scanner;

public class Nth_Fibonacci_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = findFibo(n);
		System.out.println(ans);
	}

	private static int findFibo(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
		{
			return n;
		}
		
		int f1 = findFibo(n-1);
		int f2 = findFibo(n-2);
		
		return f1+f2;
	}

}
