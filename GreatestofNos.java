package javaLearnPackage;

public class GreatestofNos {

	public static void main(String[] args) {

		int a = 455;
		int b = 2; 
		int c = 999;
		/*
		if(a>b&&a>c)
		{
			System.out.println("A is greatest");
		}else if(b>a&&b>c)
		{
			System.out.println("B is Greatest");
		}else
			System.out.println("C is Greatest");
		*/
		
		//using ternary operator
		
		int largest=a>b?a:b;
		
		largest = largest>c?largest:c;
		
		System.out.println("largest og number: " +largest);
		
		
	}

}
