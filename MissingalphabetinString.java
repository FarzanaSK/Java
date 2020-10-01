package javaLearnPackage;

import java.util.Arrays;
import java.util.HashSet;

public class MissingalphabetinString {

	public static void main(String[] args) {
		
		String inputString = "abcd";
		
		inputString = inputString.toLowerCase();
		inputString= inputString.replace(" ", "");
		System.out.println(inputString);
		
		String[] inputArray = inputString.split("");
		String[] alphabetArray = "bcdefghijklmnopqrstuvrstuvwxyz".split("");
		
		HashSet<String> set1 = new HashSet<String>();
		
		for(String s: inputArray)
		{
			set1.add(s);
		}
		
		System.out.println(set1);
		
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabetArray));
		
		System.out.println(set2);
		
		
		System.out.println(set2.removeAll(set1));
		//missing
		System.out.println(set2);
		
		
		
		
		
		
		
		
	}

}
