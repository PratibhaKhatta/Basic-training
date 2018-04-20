package com.gndu.pratibha.helloworld;

public class Handling3
{
   public static void main(String args[])
   {
	   try
	   {
		   try
		   {
		     int data=40/0;
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println(e);;
		   }
		   try
		   {
			   int a[]=new int[5];
			   a[5]=4;
		   }
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println(e);
		   }
		  
	   } 
		   catch(Exception e)
		   {
			   System.out.println("handled");
		   }
   }  
		   System.out.println("normal flow..");    
	   
   
}
