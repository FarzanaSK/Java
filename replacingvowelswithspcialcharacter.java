package javaLearnPackage;

public class replacingvowelswithspcialcharacter {

	public static void main(String[] args) {

		String inputString = " roseauus ";
		int length = inputString.length();
		
		System.out.println(inputString);
		
		String trim = inputString.trim();
		
		System.out.println(trim);
		
		int count = 0;
		
	//	inputString.replaceAll], replacement)
		
		
		for(int i =0;i<length;i++)
		{
			char charAt = inputString.charAt(i);
			
			if((charAt=='a')||(charAt=='e')||(charAt=='i')||(charAt=='o')||(charAt=='u'))
			{
	//			inputString.replace(charAt, "$");
			}
			
			
		}
		System.out.println(count);
		
	}

		
		
	}


