package javaLearnPackage;

public class findingVowelsinstring {

	public static void main(String[] args) {

		String inputString = " roseauus ";
		int length = inputString.length();
		
		System.out.println(inputString);
		
		String trim = inputString.trim();
		
		System.out.println(trim);
		
		int count = 0;
		
		for(int i =0;i<length;i++)
		{
			char charAt = inputString.charAt(i);
			
			if((charAt=='a')||(charAt=='e')||(charAt=='i')||(charAt=='o')||(charAt=='u'))
			{
				System.out.println(charAt+" is vowel");
				count = count+1;
			}
			
			
		}
		System.out.println(count);
		
	}

}
