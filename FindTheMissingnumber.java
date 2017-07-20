package testJava;

public class FindTheMissingnumber {
	
	public static int sumofNum(int n){
		int sum =(n*((n+1))/2);
		return sum;
	}

	public static int sumOfElements(int[] array){
		int sum =0;
		for(int i=0;i<array.length;i++){
			sum= sum+array[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int a =sumofNum(n);
		int [] array ={1,2,4,6,5,7,8};
	int b=	sumOfElements(array);
		
int missingNo= a-b;
System.out.println(missingNo);

	}

}
