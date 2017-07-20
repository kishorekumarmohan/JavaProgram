package testJava;

public class SecondLargestNo {
	
	public static void main(String[] args) {

		{
		int firstlargest = 0;
			int secondlargest = 0;
			int[] number = { 56, 78, 84, 90, 67, 55 };
			
			for (int n : number) {

				if (firstlargest < n) {
					secondlargest = firstlargest;
					firstlargest = n;

					
				}
				

				else if (secondlargest < n) {
					secondlargest = n;

			System.out.println(secondlargest);
				}
				System.out.println(secondlargest);
			}
			
			

		}

	
		
	}

}
