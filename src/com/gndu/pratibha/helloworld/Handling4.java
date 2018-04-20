package com.gndu.pratibha.helloworld;

public class Handling4 
{ 
	public static void main(String args[])
	{
		try
		{
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Final block is exceuted");
		}
		System.out.println("Rest of code is generated");
	}

}
