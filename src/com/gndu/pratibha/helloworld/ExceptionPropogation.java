package com.gndu.pratibha.helloworld;

import java.io.IOException;

public class ExceptionPropogation 
{
  void m()throws IOException
  {
	  throw new IOException("Device Error"); 
  }
  
  void n() throws IOException
  {
	  m();
  }
  void p()
  {
	  try
	  {
		  n();
	  }
	  catch(IOException e)
	  {
		  System.out.println(e);
	  }
  }
  public static void main(String args[])
  {
	  ExceptionPropogation obj= new ExceptionPropogation();
	  obj.p();
  }
  
}
