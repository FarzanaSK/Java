package javaLearnPackage;

public class removewhitespaces {

	public static void main(String[] args) {

		String inputString = "  testing		spaces      ";
		//Trims spaces leading and trailing
		//System.out.println(inputString.trim());
		
		//strip() --> Java 11 -->same as Trim.. stripLeading(). StripTrailing()
		
		//Regular Expresssion:
		//Removing spaces leading and Trailing
		System.out.println(inputString.replaceAll("^[ \t]+|[ \t]+$",""));
		
		//Removing all the spaces in the string
		System.out.println(inputString.replaceAll("[ \t]",""));
		
		//Removing all the spaces leading
		System.out.println(inputString.replaceAll("^[ \t]+", ""));
		
		//Removing all the spaces Trailing
		System.out.println(inputString.replaceAll("[ \t]+$",""));
				
		
		
		
		
		
	}

}
