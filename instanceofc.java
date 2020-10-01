package javaLearnPackage;

import java.util.ArrayList;
import java.util.List;

public class instanceofc {

	public static void main(String[] args) {
		
		
		List list1 = new ArrayList();
		
		list1.add("hello");
		list1.add(2);
		
		System.out.println(list1.get(0) instanceof Object);
		System.out.println(list1.get(1) instanceof Integer);
		
		
		
		
		
	}

}
