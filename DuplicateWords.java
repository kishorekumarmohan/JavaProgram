package testJava;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {
	
	public static void duplicateWord(String[] str){
		
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		
		for(String word:str){
			if(map.containsKey(word.toLowerCase())){
				
			map.put( word.toLowerCase(), map.get(word.toLowerCase())+1);
			}
			else{
				map.put( word.toLowerCase(),1);
			}
		
		Set<String>wordstring=map.keySet();
		for(String sr:wordstring){
			
			if(map.get(sr)>1){
				System.out.println(sr+" :"+map.get(sr));
			}
		}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"better", "butter" ,"better"};
		duplicateWord(str);

	}

}
