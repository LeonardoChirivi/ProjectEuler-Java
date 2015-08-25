package projectEuler;

public class euler45triangPentHexa {
	
	public static void main(String[] args) {
		
		long start = 40756;
		
		while(true){
			
			//double T = (Math.sqrt((start*8)+1)-1)/2.0;
			double P = (Math.sqrt((start*24)+1)+1)/6.0;
			double H = (Math.sqrt((start*8)+1)+1)/4.0;
			
			if( /*T-(int)T==0 &&*/ P-(int)P==0 && H-(int)H==0 ){
				System.out.println(start);
				break;
			}
			else start++;
			
		}
		//1533776805
	}
	
}
 