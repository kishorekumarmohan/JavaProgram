package testJava;

public class RemoveChString {

	
	public static String removech(String str , int p){
		
		
		String newstring = str.substring(0, p)+str.substring(p+1);
		System.out.println(newstring);
		return newstring;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removech("my name is bhuvana", 7);
		

	}

}
