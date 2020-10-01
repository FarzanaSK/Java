package javaLearnPackage;

public class swappingnos {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		/*
		//method 1:
		int c = a;
		a=b;
		b=c;
		System.out.println("a:" +a +"\n"+"b: "+b);
		
		//Method 2: without using intermediate variable
		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println("a:" +a +"\n"+"b: "+b);
		
		
		//method 3: Multiplication an division
		a= a*b; //200
		b= a/b; //10
		a=a/b; //20
		System.out.println("a:" +a +"\n"+"b: "+b);
		*/
		
		//method4: single line statetement
		b= a+b-(a=b);
		System.out.println("a:" +a +"\n"+"b: "+b);
		
		}	
		
}
