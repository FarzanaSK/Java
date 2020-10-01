package javaLearnPackage;

import java.util.Arrays;
import java.util.Scanner;

public class ascendingwithlenght {

 
	  public static void main(String[] args) { 
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the string");
	  String str=sc.nextLine(); 
	  String[] str1=str.split("\\s");
	System.out.println(Arrays.toString(str1));
	  for(int i=0;i<str1.length;i++) 
	  { 
	  for(int j=i+1;j<str1.length;j++) 
	  {
		  System.out.println(str1[i] + str1[j]);
	  if(str1[i].length()>str1[j].length()) 
	  { 
		  
		 
	  String temp= str1[i]; 
	  str1[i]=str1[j]; 
	  str1[j]=temp; 
	  System.out.println(str1[i] + str1[j] +temp);
	  } 
	  } 
	   } 
	  for(int i=0;i<str1.length;i++) 
	  { 
	  System.out.print(str1[i]+" ");  
	  } 
	  } 
	}

