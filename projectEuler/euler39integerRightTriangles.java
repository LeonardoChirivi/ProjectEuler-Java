package projectEuler;

public class euler39integerRightTriangles {
	
	public static boolean isPythagorean ( int a, int b, int c ){
		
		return a*a + b*b == c*c;
	}
	
	public static void main(String[] args) {
		int maxSum=0;
		int bigp=0;
		
		for( int p = 3; p <= 1000 ; p++ ){
			int sum=0;
			
				for( int a = 1; a <= p/2 ; a++ ){
					for( int b = a+1; b <= p/2 ; b++ ){
						int c = p -(a+b);  
						if( a+b+c==p && isPythagorean(a,b,c) ){
							sum++;
						}
					}
				}
			if(sum>maxSum){
				maxSum=sum; bigp=p;
			}
			
		}
		System.out.println(bigp);
		//840
	}
}