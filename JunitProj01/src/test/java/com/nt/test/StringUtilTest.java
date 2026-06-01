package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nt.service.StringUtil;

public class StringUtilTest 
{
	private static StringUtil util;
    
	@BeforeAll	
	public static void setuponce() 
	{
		System.out.println("StringUtilTest.setuponce()");
		util=new StringUtil();	
	}
	@BeforeEach
	public void setup() 
	{
		System.out.println("StringUtilTest.setup()");
		
	}
	@Test
	public void  testisPallendromewithvaliddata() 
	{
		System.out.println("StringUtilTest.testisPallendromewithvaliddata()");
		boolean flag=StringUtil.isPallendrome("madam");
		assertTrue(flag);
	}
	@Test
	public void  testisPallendromewithInvalidvaliddata() 
	{
		System.out.println("StringUtilTest.testisPallendromewithInvalidvaliddata()");
		boolean flag=StringUtil.isPallendrome("madam1");
		assertFalse(flag);
	}
	@Test
	public void  testisPallendromewithnodata() 
	{
		System.out.println("StringUtilTest.testisPallendromewithnodata()");
		assertThrows(IllegalArgumentException.class,()->StringUtil.isPallendrome("") );
	}
	@Test
	public void testCreatedDatewithValidData() 
	{
		LocalDate Id=util.createDate(2000, 10, 20);
		assertNotNull(Id);
		assertEquals(LocalDate.of(2000, 10, 20), Id);
	}
	@Test
	public void testCreatedDatewithInValidData() 
	{
		LocalDate Id=util.createDate(1780, 10, 20);
		assertNull(Id);
	}
	@Test
	public void testSingleTonClass() 
	{
		Runtime rt1= Runtime.getRuntime();
		Runtime rt2= Runtime.getRuntime();
		System.out.println(rt1.hashCode()+""+rt2.hashCode());
		assertSame(rt1, rt2);
	}
	
	@Test
	public void testNonSingleTonClass() 
	{
		Date d1=new Date();
		Date d2=new Date();
		System.out.println(d1.hashCode()+""+d2.hashCode());
		assertNotSame(d1, d2);
		
	}
	
	@AfterEach
	public void teardown() 
	{
		System.out.println("StringUtilTest.teardown()");
		
	}
	@AfterAll
	public static void teardownonce() 
	{
		System.out.println("StringUtilTest.teardownonce()");
		util=null;
		
	}

}
