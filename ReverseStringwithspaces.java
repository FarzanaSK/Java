package javaLearnPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStringwithspaces {

		static void reverseString(String input) {  

			char[] inputArray = input.toCharArray();  
			char[] result = new char[inputArray.length];  
			
			System.out.println(inputArray.length);
			for (int i = 0; i < inputArray.length; i++) {  
				if (inputArray[i] == ' ') {  
					result[i] = ' ';  
				}  
			}  

			int j = result.length - 1;  
			System.out.println(j);
			
			for (int i = 0; i < inputArray.length; i++) {  
				if (inputArray[i] != ' ') {  
					if (result[j] == ' ') {  
						j--;  
					}  
					result[j] = inputArray[i];  
					j--;  
				}  
			}  
			System.out.println(input + " --> " + String.valueOf(result));  
		}  

		public static void main(String[] args) {
			reverseString("India Is my country");  

		}
	
}

/*
	
	public static void main(String[] args) {
		

	//String str = "India is a wonderful country";
			String str = "Time and Tide waits for none";
			int spaceCount = str.replaceAll("\\S", "").length();
			System.out.println("count" + spaceCount);
			char[] charArray = str.toCharArray();
			//Print the original string
			System.out.println(Arrays.toString(charArray));

			int[] arraySpaces = new int[spaceCount];
			int j = 0;
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] == ' ') {
					arraySpaces[j] = i;
					j++;
				}
			}
			
			ArrayList<Character> list = new ArrayList<Character>();
			
			//Print indexes of ' '
			System.out.println(new String(Arrays.toString(arraySpaces)));
			
			for (int i = charArray.length - 1; i >= 0; i--) {
				if (charArray[i] != ' ')
					list.add(charArray[i]);
			}
		
			for(j = 0; j< arraySpaces.length;j++){
				list.add(arraySpaces[j], ' ');
			}
			//Print after reverse with spaces as the original string
			System.out.println(list);

	}
	}
	
	*/