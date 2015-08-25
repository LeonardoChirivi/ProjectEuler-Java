package projectEuler;

public class euler35circularPrimes {
	
	public static boolean isPrime( int n){
		
		for( int i = 2; i <= Math.sqrt(n); i++ ){
			if( n%i == 0 ) return false;
		}
		return true;
	}
	
	public static int circular( int n ){
		
		String num = Integer.toString(n);
		num = num.substring(1) + num.charAt(0);
		return Integer.parseInt(num);		
	}
	
	public static void main(String[] args) {
		
		long circularPrimes = 0;
		
		for( int i = 2; i < 1000000 ; i++ ){
			
			if( isPrime(i) ){
				
				int circle = circular(i);
				
				for( int j=1; j<Integer.toString(i).length() ; j++ ){
					
					if(isPrime(circle)) circle = circular(circle);
					else break;
					
				}
				if( i == circle ) circularPrimes ++;
			}
		}
		
		System.out.println(circularPrimes);
	}
	
}
