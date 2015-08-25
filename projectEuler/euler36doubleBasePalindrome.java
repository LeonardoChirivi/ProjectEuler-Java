package projectEuler;

public class euler36doubleBasePalindrome {
	
	public static boolean isPalindrome( String s ){
		
		int i = 0, j = s.length()-1;
		boolean c = true;
		
		while(c){
			
			if( i==j || i>j ) break;
			
			if( s.charAt(i) == s.charAt(j) ){
				
				i++; j--;
				
			}
			else {
				c=false; return c;
			}
		}
		return c;
		
	}
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for( int i = 1; i < 1000000 ; i+=2){
			
			String bin = Integer.toBinaryString(i);
					
			if( isPalindrome(Integer.toString(i)) && isPalindrome(bin)  ) sum += i;
		}
		
		System.out.println(sum);
		//872187
	}
	
}
