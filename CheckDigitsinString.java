package javaLearnPackage;

public class CheckDigitsinString {

	public static void main(String[] args) {

		String inputString = "1Hello123World1";
		int total = 0;
		int length = inputString.length();
		for(int i =0;i<length;i++)
		{
			char charAt = inputString.charAt(i);	
			if(Character.isDigit(charAt))
			{
				System.out.print(charAt);
				total = total+Character.getNumericValue(charAt);	
			}
		}
		System.out.println("\n"+total);
	}
}
