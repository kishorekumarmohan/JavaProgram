package testJava;

import java.util.Scanner;

public class PrintFirst100No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number N :");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++){
			System.out.println("FiRst N numbers:" +i);
		}
		

	}

}
