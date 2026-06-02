package com.nt.main;

import com.nt.service.ArithmeticOperations;

public class AppTest 
{
	public static void main(String[] args) {
		ArithmeticOperations ops=new ArithmeticOperations();
		System.out.println("Result is::"+ops.sum(10, 20));
	}

}
