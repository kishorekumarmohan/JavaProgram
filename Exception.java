package testJava;

public class Exception {
	
	public static void main(String[] args) {
		
		try {
			int n=50/0;
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			// TODO: handle exception
		}
		System.out.println("rest of the code");
	}
}
