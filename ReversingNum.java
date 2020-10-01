package javaLearnPackage;

import java.util.Scanner;

public class ReversingNum {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		/*
		// Method1: using scanner 
		System.out.println(num);
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;s
			num=num/10;
		}
		
		//Method 2: using stringbuffer
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		//Method3:using stringBuilder
		 
		*/
		StringBuilder sBL = new StringBuilder();
		sBL.append(num);
		StringBuilder rev = sBL.reverse();
		
		System.out.println("Reverse number: "+rev);
		
	}

}
