package testJava;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s1={"one","two","four","five"};
		String[] s2={"black","yellow","white ","one"};
		HashSet<String> set1= new HashSet<String>(Arrays.asList(s1));
		HashSet<String>set2= new HashSet<String>(Arrays.asList(s2));
		set1.retainAll(set2);
		System.out.println(set1);
			
		
		
		
	}

}
