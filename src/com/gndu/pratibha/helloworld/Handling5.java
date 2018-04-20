package com.gndu.pratibha.helloworld;

public class Handling5
{
	static void validate(int age)
	{
		if(age<18)throw new ArithmeticException("Not valid");
		else
		{
			System.out.println("Welcome to the vote");
		}
		
	}
	public static void main(String args[])
	{
		validate(21);
		System.out.println("rest of the code is exceuted");
	}

}
