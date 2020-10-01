package javaLearnPackage;

public class Palindrome {

	public static void main(String[] args) {

		String str = "farzana";
		int length = str.length();
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		
		if(str.contentEquals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
		
	}

}
