package testJava;


import java.util.HashSet;


public class DuplicateArray{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strarray= {"bhuvana", "siddu","harish","harish"};
		
		HashSet<String> set= new HashSet<String>();

		
		for(String arrayelement: strarray){
		
			
			if(!(set.add(arrayelement))){
				
				System.out.println("array :" + arrayelement);
			}
		}
			
		}
}
