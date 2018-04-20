package com.gndu.pratibha.helloworld;

public class ThreadExample3  extends Thread
{
     public void run()
     {
    	 for(int i=1;i<=5;i++)
    	 {
    		 try
    		 {
    			 Thread.sleep(600);
    		 }
    		 catch(InterruptedException e)
    		 {
    			 System.out.println(e);
    		 }
    		 System.out.println(i);
    	 }
    		 
     }
     public static void main (String args[])
     {
    	 ThreadExample3 eg1 =new ThreadExample3();
    	 ThreadExample3 eg2 =new ThreadExample3();
    	 eg1.start();
    	 eg2.start();
     }
}
