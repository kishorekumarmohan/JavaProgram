package testJava;

import java.util.Scanner;

public class CounttwoConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		for (int i=0;i<s.length();i++){
			
			for(int j=i+1;j<s.length();j++){
				
		if(s.charAt(i)==s.charAt(j))
		{
			count++;
			System.out.println(count);
		}
		
		else{
			break;
		}
					
				}
			}
		}
		

	}

	