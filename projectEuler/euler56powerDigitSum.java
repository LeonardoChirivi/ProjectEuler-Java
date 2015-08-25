package projectEuler;

import java.math.BigInteger;

public class euler56powerDigitSum {
	
	public static long digitSum( BigInteger n ){
		
		long sum = 0;
		while( n.compareTo(BigInteger.ZERO) > 0 ){
			
			sum. n.mod(BigInteger.TEN); 
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		long powerSum = 0;
		
		for( int a = 1; a <= 99 ; a++ ){
			for( int b = 1; b <= 99 ; b++ ){
				BigInteger pow = BigInteger.valueOf( a );
				pow = pow.pow(b);
				
				
			}			
		}
		System.out.println(powerSum);
		
	}
	
}
