package com.gndu.pratibha.helloworld;

public class TestThread  extends Thread
{
        public void run()
        {
        	System.out.println("Thread is running");
        }
        public static void main(String args[])
        {
        	TestThread thread1= new TestThread();
        	
        	thread1.start(); //will run
        	thread1.start(); //will not run as thread shows exception when made to run second time
        	
        }
}
