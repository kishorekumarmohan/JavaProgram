package testJava;

import java.util.Arrays;

public class Checkanagram {
	static boolean status=true;
	static void Anagram(String s1 ,String s2){
		
		if(s1.length()!=s2.length()){
			
			
		boolean status =false;
			
		
		}
		
		else{
			char[] array1=s1.toCharArray();
			char[] array2=s2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			boolean	status=Arrays.equals(array1, array2);
		}
		if(status){
			System.out.println(" "+ s1+" and "+s2+" are anagrams");
		}
		else{
			System.out.println("not an anagram");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram("cat", "tac");

		
	}

}
