package javaLearnPackage;

import java.util.Random;

public class RandomNumberGen {

	public static void main(String[] args) {

		Random rand = new Random();
		int num = rand.nextInt(1000);
		System.out.println(num);
		
		//method2: Math.random
		
		System.out.println(Math.random());
				
		
		
	}

}
