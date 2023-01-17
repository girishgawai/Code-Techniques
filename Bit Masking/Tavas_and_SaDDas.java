package bitmasking;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		count(str);
	}

	private static void count(String str) {
		// TODO Auto-generated method stub
		int n = str.length();							// len of the given number(no of digits)
		
		int count = (1<<n)-2;						// it will the all possible combination of valid lucky nos from 1 to n-1
		
		// ab bache hue n digit se bnne wale lucky nos find krege
		int pos = 0;				// yeh pos pe rhega curr digit wali loc se phle kitne digits ki space hai bnne k liye
		for(int i=str.length()-1;i>=0;i--)										// i start hoga end wale digits se given number ke
		{
			// agr bda wala lucky no ka digit milega 7 toh hi usko chote me 4 me convert krke chota wala valid lucky bn skta hai
			if(str.charAt(i)=='7')
			{
				count = count + (1<<pos);			// 1<<pos means jitni phle digits hogi unpe kitne combos bn krte .. (3) hai toh 2^3
			}
			
			pos++;					// pos ko 1 se bdhana v hai
		}
		
		System.out.println(count+1);
	}
}
