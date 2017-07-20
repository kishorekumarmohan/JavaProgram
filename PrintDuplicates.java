package testJava;

import java.util.HashSet;
import java.util.Iterator;

public class PrintDuplicates {

	
	public static void dp(int[] num){
		
		
		
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<=num.length;i++){
			System.out.println("arrays with duplicates:" +num[i]);
			if(!(set.add(num[i]))){
				System.out.println("duplicate numbers:"+num[i]);
				
			};

		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num={2,3,3,4,3,5,6,5,6};
PrintDuplicates.dp(num);
	}

}
