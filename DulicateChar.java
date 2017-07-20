package testJava;

import java.util.HashMap;

public class DulicateChar {
	
	public static void duplicateChar(String input){
 HashMap<Character ,Integer> map= new HashMap<Character,Integer>();
 
		  
 char[] word =input.toCharArray();
 for (char ch:word){
	 if(map.containsKey(ch)){
		 System.out.println(map.put( ch,map.get(ch)+1));
	 }
	 else{
		 System.out.println(map.put(ch, 1));
	 }
	 
	
 }
 System.out.println(map);
	 
 
	}
	

	public static void main(String[] args) {
		

		duplicateChar("java j2ee java jsp j2ee");
		

	}

}
