package com.gndu.pratibha.helloworld;
import java.util.Scanner;
public class Fibonnaci2
      {
	    public static void main(String args[])
	    {
	    	
	    	Scanner s =new Scanner(System.in);
	    	System.out.println("Enter the value");
	    	int n = s.nextInt();
	    	fibonacci(n);
	    	
	    }
 public static void fibonacci(int n)
 {
	 if(n==0)
	 {
		 System.out.println("0");
		
	 }
	 else if(n==1)
	 {
		 System.out.println("0 1");
		 
	 }
	 else
	 {
		 System.out.println("0 1");
		 int a=0;
		 int b=1;
		 for(int i= 1;i<=n;i++)
		 {
			 int c=a+b;
			 System.out.println(c+" ");
			 a=b;
			 b=c;
		 }
	 }
	 
 }
}
