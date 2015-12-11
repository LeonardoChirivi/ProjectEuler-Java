package projectEuler;

public class euler1multiplesOf3and5 {
	
	public static void main(String[] args) {
		
		
		int somma=0;
		
		for(int i = 1; i < 1000; i++){
			if( i%3==0 || i%5==0 )
				somma += i;
		}
		System.out.println(somma);
	}
	
}
