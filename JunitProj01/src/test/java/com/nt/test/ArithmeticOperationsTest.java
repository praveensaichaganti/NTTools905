package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


import com.nt.service.ArithmeticOperation;


@DisplayName("ArthmeticOperationsTest")
public class ArithmeticOperationsTest 
{
	private static  ArithmeticOperation ops;
	@BeforeAll
	private static void setup() 
	{
	 System.out.println("ArithmeticOperationsTest.setupOnce()");
	 ops=new ArithmeticOperation();
	} 
	@BeforeEach
	public  void setupDown() 
	{
		System.out.println("ArithmeticOperationsTest.tearDownOnce()");
	}
	@Test
//	@DisplayName("testsum +ves")
	@Order(10)
	public void testsumwithPositives() 
	{
		ArithmeticOperation ops=new ArithmeticOperation();
		System.out.println("ArithmeticOperationsTest.testsumwithPositives()");
		double a=100.0;
		double b=200.0;
		double expceted =300.0;
		double actual=ops.sum(a, b);
		assertEquals(expceted,actual);
	}
	@Test
//	@DisplayName("testsum -ves")
//	@Tag("dev")
//	@Tag("test")
	@Order(1)
	public void testsumwithnegative() 
	{
		ArithmeticOperation ops=new ArithmeticOperation();
		System.out.println("ArithmeticOperationsTest.testsumwithnegative()");
		double a=-100.0;
		double b=200.0;
		double expceted =100.0;
		double actual=ops.sum(a, b);
		assertEquals(expceted,actual);
	}
	@Test
//	@DisplayName("testsum with mixed ves")
//	@Tag("dev")
//	@Tag("test")
	@Order(15)
	public void testsumwithMixedValue() 
	{
		ArithmeticOperation ops=new ArithmeticOperation();
		System.out.println("ArithmeticOperationsTest.testsumwithMixedValue()");
		double a=-100.0;
		double b=200.0;
		double expceted =100.0;
		double actual=ops.sum(a, b);
		assertEquals(expceted,actual);
	}
	@Test
//	@DisplayName("test sum with Zero values")
//	@Tag("dev")
//	@Tag("test")
	@Order(10)
	public void testsumwithZeroValue() 
	{
		ArithmeticOperation ops=new ArithmeticOperation();
		System.out.println("ArithmeticOperationsTest.testsumwithZeroValue()");
		double a=0.0;
		double b=0.0;
		double expceted =0.0;
		double actual=ops.sum(a, b);
		assertEquals(expceted,actual);
	}
	@Test
//	@Disabled
//	@DisplayName("Test sum with High Values")
//	@Tag("prod")
	@Order(-13)
	public void testsumwithHighValue() 
	{
		System.out.println("ArithmeticOperationsTest.testsumwithHighValue()");
		ArithmeticOperation ops=new ArithmeticOperation();
		double a=111111111111111.0;
		double b=222222222222222.0;
		double expceted =333333333333333.0;
		double actual=ops.sum(a, b);
		assertEquals(expceted,actual,5.0,"Testing With Values"); 
	}
	@BeforeEach
	public  void setDown() 
	{
		System.out.println("ArithmeticOperationsTest.tearDownOnce()");
	}
	 
	@Test
//	@Tag("dev")
//	@Tag("test")
	@Order(100)
	public void testSumForTimeout() 
	{
		System.out.println("ArithmeticOperationsTest.testSumForTimeout()");
		assertTimeout(Duration.ofMillis(3020),()->ops.sum(1000, 2000));
	}
	
	@AfterAll
	public static void tearDownOnce() 
	{
		System.out.println("ArithmeticOperationsTest.tearDownOnce()");
		ops=null;
		
	}

}
