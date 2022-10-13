package recursion;

import java.util.Iterator;
import java.util.Scanner;

public class N_Knight_Problem {
	public static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][]  board = new boolean[n][n];

//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board[0].length; j++) {
				setKnights(board,0,0,n);
//			}
//		}
				
				System.out.println("\n"+count);
	}

	private static void setKnights(boolean[][] board, int row, int col, int knight) {
		// TODO Auto-generated method stub
		if(knight==0)
		{
			display(board);
			count++;
			return;
//			knight++;
		}
		
		if(col>=board[0].length)
		{
			col=0;
			row++;
		}
		
		if(row>=board.length)
		{
			return;
		}
		

			if(isItSafe(board,row,col)==true)
			{
				board[row][col]=true;
				setKnights(board, row, col+1, knight-1);
				board[row][col]=false;
			}
		
			setKnights(board, row, col+1, knight);


	}

	private static void display(boolean[][] board) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board[0].length; j++) {
//				System.out.print(board[i][j] + "  ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]==true)
					System.out.print("{"+i+"-"+j+"} ");
			}
		}
	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		
		
//		work nhi krege yeh commented part
//		// left up
//		if((row-1)>=0 && (col-2)>=0 && (row-1)<board.length && (col-2)<board[0].length && board[row-1][col-2]==true)
//			return false;
//		
//		// right up
//		if((row-1)>=0 && (col+2)>=0 && (row-1)<board.length && (col+2)<board[0].length && board[row-1][col+2]==true)
//			return false;
//		
//		// up left
//		if((row-2)>=0 && (col-1)>=0 && (row-2)<board.length && (col-1)<board[0].length && board[row-1][col-2]==true)
//			return false;
//		
//		// up right
//		if((row-2)>=0 && (col+1)>=0 && (row-2)<board.length && (col+1)<board[0].length && board[row-1][col+2]==true)
//			return false;
		
//		isItSafe(board,row-1,col-2);
//		isItSafe(board,row-1,col+2);
//		isItSafe(board,row-2,col-1);
//		isItSafe(board,row-2,col+1);

		int[] r = {-1,-1,-2,-2};
		int[] c = {-2,2,-1,1};
		
		for (int i = 0; i < c.length; i++) {	// agr range me hai AND aur true hai uss jh=gah pe mtlb ghoda bitha hai toh false return
			if(r[i]+row>=0 && r[i]+row<board.length && c[i]+col>=0  && c[i]+col<board[0].length && board[row+r[i]][col+c[i]]==true)
				return false;
				
		}



		return true;
	}

}
