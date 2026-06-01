package com.nt.service;

public class OpeartionsService 
{
	public double add(double a, double b) 
	{
	  return a+b;	
	}
	public boolean isPallendrome(String str) 
	{
		// reverse string\
		String revStr=new StringBuffer(str).reverse().toString();
		return str.equals(revStr);
	}

}
