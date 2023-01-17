package bitmasking;

public class LeftShift_RightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/******** Right Shift Operator ********/			// in Rt. shift /2 effects for each shift
		System.out.println(9>>2);				
		System.out.println(-9>>2);				// In Rt shift for both Odd/Even in +ve --> normal hoga

		/*****************************		(Only -ve ODD ka +1 hoga for Right Shift)		*****************************/

		System.out.println(6>>1);				// In Rt shift for -ve in Odd --> +1 hoga
		System.out.println(-6>>1);

		/******** Left Shift Operator ********/				// in Lt. shift *2 effects for each shift
		System.out.println(9<<2);
		System.out.println(-9<<2);
		// In Left Shift for both Odd/Even its normal
		System.out.println(6<<1);
		System.out.println(-6<<1);
	}

}
