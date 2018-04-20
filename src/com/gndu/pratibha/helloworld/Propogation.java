package com.gndu.pratibha.helloworld;

public class Propogation
{
    void m()
    {
    	@SuppressWarnings("unused")
		int data=45/0;
    }
    void n()
    {
    	m();
    }
    void p()
    {
    	try
    	{
    		n();
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("Exception handled");
    	}
    }
    public static void main(String arg[])
    {
    	Propogation obj=new Propogation();
    	obj.p();
    }
}
