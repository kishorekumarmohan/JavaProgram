package testJava;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
					
			int n=0;
			int i=0;
			String primenumbers=" ";
					for(i=0;i<=100;i++){
						int counter =0;
						for(int j=i;j>=1;j--){
							if(i%j==0){
								counter=counter+1;
							}
							if(counter==2){
							primenumbers= primenumbers+ i+" ";
							}
							
						}
								
			
	}
					System.out.println("prime numbers are"+ primenumbers);
	}
}