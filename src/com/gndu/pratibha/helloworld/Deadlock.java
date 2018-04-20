package com.gndu.pratibha.helloworld;

public class Deadlock 
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Entering the thread");
			Thread.currentThread().join();
			System.out.println("Thread will not exceute");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
