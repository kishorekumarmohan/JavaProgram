package testJava;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= "this is the program to test      all the white Space";

String replace = s1.replaceAll("\\s", "");
System.out.println(replace);
		
	}

}
