/* You have to set the given all the queens in in all possible blcoks individually, so that they can be set into all possible
 * permutation arrangements. Two queens cannot be sit on same block at same time.
 */

package recursion;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tnq=2;
		boolean[] blocks = new boolean[4];
		
		printAllPermutaions(tnq, blocks, 0, "");
	}

	private static void printAllPermutaions(int tnq, boolean[] blocks, int queensPlaced, String ans) {
		// TODO Auto-generated method stub
		if(queensPlaced==tnq)
		{
			System.out.println(ans);
			return;
		}
		
		for (int j = 0; j < blocks.length; j++) {
			if(blocks[j]==false)
			{
				blocks[j]=true;
				printAllPermutaions(tnq, blocks, queensPlaced+1, ans+"B"+j+"Q"+queensPlaced);
				blocks[j]=false;
			}
		}
		
		
	}

}
