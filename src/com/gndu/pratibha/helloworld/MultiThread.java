package com.gndu.pratibha.helloworld;

class MultiThreadDemo extends Thread {
	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getId() + "is running");
		} catch (Exception e)

		{
			System.out.println("Exception is caught");
		}
	}
}

public class MultiThread

{
	

	public static void main(String args[])
		{
		int number=8;
		
		for(int loop=0;loop<=8;loop++)
		{
			MultiThreadDemo obj= new MultiThreadDemo();
	     obj.start();
		}
}
	}