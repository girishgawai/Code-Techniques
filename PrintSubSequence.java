package recursive_tree;

import java.util.Scanner;

public class PrintSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
//		printSubSeq(str, "");
		printSubSeq(str, new String());
	}

	private static void printSubSeq(String que, String ans) {
		// TODO Auto-generated method stub
		if(que.length()==0)
		{
			System.out.println(ans);
			return;
		}
			
		char ch = que.charAt(0);
		printSubSeq(que.substring(1), ans);
		printSubSeq(que.substring(1), ans+ch);
		
	}

}
