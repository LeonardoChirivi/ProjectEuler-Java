package projectEuler;

import java.math.BigInteger;

public class euler10 {
	
	public static boolean isPrime(int n){
		
		for(int i=2; i<=Math.sqrt(n);i++){
			
			if (n%i==0) return false;
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		BigInteger sum = BigInteger.valueOf(0);
		
		for ( int i=2 ; i<=2000000;i++ )
			if (isPrime(i)) sum = sum.add(BigInteger.valueOf(i));
					
		//142913828922
		System.out.println(sum);
		
	}
}

