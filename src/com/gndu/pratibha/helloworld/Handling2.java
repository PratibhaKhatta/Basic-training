package com.gndu.pratibha.helloworld;

public class Handling2 
{
	public static void main(String args[])
	{
		try
		{
			int a[] =new int[5];
			a[5]= 30/0;
		}
		catch(Exception e)
		{
			System.out.println("task2 is completed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("task1 is completed");
		}
		
		System.out.println("Rest of the code");
	}

}
