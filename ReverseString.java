package javaLearnPackage;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Str = sc.nextLine();
		String rev="";
		/*
		//Method 1: Using StringBuffer
		StringBuffer sb = new StringBuffer(Str);
		StringBuffer rev = sb.reverse();
		
		//Method2: using charAt
		
		int length = Str.length();
		for (int i = length-1; i >=0 ; i--) {
			
			char charAt = Str.charAt(i);
			rev= rev+charAt;
			
		}
		*/
		//Method3: using toCharArray
		char[] charArray = Str.toCharArray();
		int length = charArray.length;
		
		for (int i = length-1; i >=0; i--) 
		{
			rev=rev+charArray[i];
		}
		
		System.out.println("Reverse String: "+rev);
		
		
	}

}
