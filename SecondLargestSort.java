package testJava;

import java.util.Arrays;

public class SecondLargestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={56,78,90,54,67,87};
		Arrays.sort(num);
		System.out.println("firstlargest:"+ num[num.length-1]);
		System.out.println("secondlargest" +num[num.length-2]);

	}

}
