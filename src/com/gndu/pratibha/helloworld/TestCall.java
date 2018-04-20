package com.gndu.pratibha.helloworld;

public class TestCall extends Thread 
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String args[])
	{
		TestCall test=new TestCall();
		test.run(); //run method will use the current stack not the new stack
	}

}
