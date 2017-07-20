package testJava;

import java.util.Scanner;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	System.out.println("enter the String 1:");
		String  word1 = sc.nextLine();
		System.out.println("enter String two:");
		String word2= sc.nextLine();
		System.out.println("before Swap: "+ word1 + " " +word2);
		
		word1 = word1+word2;
		
		word2=word1.substring(0,word1.length()-word2.length());
		
		word1=	word1.substring(word2.length());
		
		
		System.out.println("after Swaping:" +word1 +" "+word2);

	}

}
