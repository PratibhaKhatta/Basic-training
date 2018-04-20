package com.gndu.pratibha.helloworld;

public class DaemonThread extends Thread
{ 
	{
	 if(Thread.currentThread().isDaemon())
	 {
		 System.out.println("Daemon Thread is running");
		
	 }
	 else
	 {
		System.out.println("User thread is running");
	 }
   public static void main(String args[])
   {
	   DaemonThread thread1= new DaemonThread();
	   DaemonThread thread2= new DaemonThread();
	   thread1.setDaemon(true);
	   thread1.start();
	   thread2.start();
	   
   }

}
