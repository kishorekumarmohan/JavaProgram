package testJava;

import java.util.Scanner;

public class ReverseString {
	
	String reverse="";
	public String Stringreverse(String str){
		
		if(str.length()==1) {
			return str;
		}
		else{
			
			reverse= str.charAt(str.length()-1)+Stringreverse(str.substring(0,str.length()-1));
			return reverse;
			
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ReverseString s = new ReverseString();

String  srr=s.Stringreverse("siddesh");
System.out.println(srr);
		
	}

}
