package com.gndu.pratibha.helloworld;

public class ThreadExample2  implements Runnable
{
    public void run()
    {
    	System.out.println("Thread is running");
    
    }
    public static void main(String args[])
    {
    	ThreadExample2 eg = new ThreadExample2();
    	Thread  t =new Thread(eg);
    	t.start();
    }
}
