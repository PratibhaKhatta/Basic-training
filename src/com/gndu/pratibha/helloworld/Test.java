package com.gndu.pratibha.helloworld;
// program to control main thread
public class Test extends Thread
{
	public static void main(String args[])
	{
	      Thread t = Thread.currentThread();
	     System.out.println("Current Thread" +t.getName()); //getname of current thread
	     System.out.println("Main Thread Priority" +t.getPriority());
	     t.setPriority(MAX_PRIORITY); //set maximum priority
	     System.out.println("Main thread new priority: "+ t.getPriority());
         
	     for (int num=1;num<8;num++)
	     {
	    	 System.out.println("Main Thread" + num);
	     }
	     
	     ChildThread ct =new ChildThread();// childThread is created of main thread
	     System.out.println("ChildThreadPriority" + ct.getPriority());
	     ct.setPriority(MIN_PRIORITY); // set minimum priority
	     System.out.println("ChildThreadPriority" + ct.getPriority());
	     ct.start();
	}
}
  class ChildThread extends Thread //child thread class
 {
	 public void run()
	 {
		 for(int num=1;num<8;num++)
		 {
			 System.out.println("Child Thread"+ num);
		 }
	 }
 }
 