package javaLearnPackage;

public class countevenoddnos {

	public static void main(String[] args) {

		int num = 123456789;
		int evencount = 0;
		int oddcount=0;
		/*
		//metod1:
		for(int i=2;i<=9;i+=2)
		{
			evencount =evencount+1;
		}
		for(int i=1;i<=9;i+=2)
		{
			oddcount =oddcount+1;
		}
		*/
		
		//method2:
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			
			if(rem%2!=0)
			{
				oddcount=oddcount+1;
			}
			else
			{
				evencount=evencount+1;
			}
			
			
		}
		
		
		System.out.println("Number of even numbers: "+evencount);
		System.out.println("Number of odd numbers: "+oddcount);

	}



}
