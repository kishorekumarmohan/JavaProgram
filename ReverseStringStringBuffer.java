package testJava;


import java.util.Scanner;

public class ReverseStringStringBuffer {

	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the String");
	String word =sc.nextLine();
	
	StringBuffer newword = new StringBuffer(word);
	String reword = newword.reverse().toString();
	System.out.println(reword);
		
	}
}
