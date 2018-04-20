package com.gndu.pratibha.helloworld;

public class ExceptionHandling
{
	public static void main(String args[])
	{
		  fun();
	}
	public static void fun()
	{
		 MoreFun();
		
		System.out.println("Method is a fun");
		
	}
	public static void MoreFun()
	{
		@SuppressWarnings("unused")
		int data=50/0;
		System.out.println("This method is more fun");
	}
	

}
