package recursion;

import java.util.Scanner;

public class Count_SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int count = countSubSeq(str,"");
		System.out.println(count);
	}

	private static int countSubSeq(String que, String ans) {
		// TODO Auto-generated method stub
		if(que.length()==0)
		{
			System.out.println(ans);
			return 1;
		}
		
		char ch = que.charAt(0);
		int s1 = countSubSeq(que.substring(1), ans);
		int s2 = countSubSeq(que.substring(1), ans+ch);
		return s1+s2;
	}

}
