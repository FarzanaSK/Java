package javaLearnPackage;

public class missingnumberinarray {

	public static void main(String[] args) {
		
		int a[] = {1,2,4,5};
		
	/*	for(int i=0;i<5;i++)
		{
			int missing = a[i]+1;
			if(a[i+1]!=a[i]+1)
			{
				System.out.println("missing number is:" +missing);
			}
			
		}
		
		*/
		
		for(int i=0;i<=4;i++)
		{
			if(a[i]!=i+1)
			{
				System.out.println(i);
			}
		}
		
	}

}
