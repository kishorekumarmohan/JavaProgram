package testJava;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestString {
	
	public void duplicateArray(String[] str){
		Set<String> sc = new HashSet<String>();
		
		for(String array : str){
			
			if(!(sc.add(array))){
				System.out.println(array);
			}
				
		}
		
	
	}
	public static void main(String[] args) {
		TestString tt= new TestString();
		String[] str ={"bhuvana","bhuvana","laya","jash","sidd"};
	  tt.duplicateArray(str);
	  
  }
		
}	
	
	
	
		
	
			
	
	


