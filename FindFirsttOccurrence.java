package recursive_tree;

import java.util.Scanner;

public class FindFirsttOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int item = sc.nextInt();
		
		System.out.println(findOccurrence(arr, item, 0));
	}
	
	
	public static int findOccurrence(int[] arr, int item, int index)
	{
		if(index==arr.length)
			return -1;
		
		if(arr[index]==item)
			return index;
		
		return findOccurrence(arr, item, index+1);
	}

}
