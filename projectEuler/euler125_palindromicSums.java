package projectEuler;

import java.util.ArrayList;

public class euler125_palindromicSums {
	
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
		
		int limit = 100000000;
        double sqrtLimit = Math.sqrt(limit);
        
        long sum = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for (int i = 1; i <= sqrtLimit; i++) {
            int number = i*i;
            for (int j = i + 1; j <= sqrtLimit; j++) {
                number += j * j;
                if (number > limit) break;

                if (isPalindrome( Integer.toString(number) ) && !numbers.contains(number) ) {
                    sum += number;
                    numbers.add(number);                        
                }

            }
        }
        
        System.out.println(sum);
     
        
	}
	
}
