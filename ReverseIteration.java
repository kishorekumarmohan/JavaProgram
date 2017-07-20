package testJava;

public class ReverseIteration {
	
	public char[] reverseString(String str1){


       
 
     char[] characters = str1.toCharArray();

    char[] reverseChars = new char[characters.length];

 
        for( int i = 0 ; i < characters.length  ; i++){
            reverseChars[i] = characters[(characters.length-1)-i]; 
        }
		return reverseChars;
	}

      
public static void main(String[] args) {
	
	ReverseIteration re = new ReverseIteration();
	char[] srr=re.reverseString("this is Java Program");
	System.out.println(	srr);
	
}	
}
