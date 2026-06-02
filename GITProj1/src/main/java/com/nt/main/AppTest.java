package com.nt.main;

import com.nt.service.ArithmeticOperations;

public class AppTest 
{
	public static void main(String[] args) {
		ArithmeticOperations ops=new ArithmeticOperations();
		System.out.println("Result(sum)is::"+ops.sum(10, 20));
		System.out.println("Result(sub)is::"+ops.sub(20,40));
	}

}
