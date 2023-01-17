package bitmasking;

public class Is_Bit_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 67;
		
		// is 3rd bit is set in 67..?
		if(isSet(n, 3))
			System.out.println("Set");
		else
			System.out.println("Not Set");
		
	}

	private static boolean isSet(int n, int i) {
		// TODO Auto-generated method stub
		int mask = 1<<i;				// 10000
		if((n & mask) != 0)
			return true;
		else
			return false;
		
//		if(((n>>i) & 1) == 1)
//			return true;
//		
//		System.out.println((n>>i) & 1);
//		return false;
	}

}
