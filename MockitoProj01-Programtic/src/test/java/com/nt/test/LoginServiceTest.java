package com.nt.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.nt.dao.ILoginDAO;
import com.nt.service.ILoginMgmtService;
import com.nt.service.LoginMgmtServiceImpl;

public class LoginServiceTest 
{
	private static ILoginMgmtService LoginService;
	private static ILoginDAO mockDao;
	
	@BeforeAll
	public static void setuponce() 
	{
		// create Mock Dao class object	
		mockDao=Mockito.mock(ILoginDAO.class);
		System.out.println(mockDao.getClass()+"...."+Arrays.toString(mockDao.getClass().getInterfaces()));
		// create Service class obj having Mock	;
		LoginService=new LoginMgmtServiceImpl(mockDao);
	}
	
	@Test
	public void testLoginWithValidCredentials() 
	{
		System.out.println("LoginServiceTest.testLoginWithValidCredentials()");
		// convert mock object to stub object by providing dummy functonality to mock obj methods
		Mockito.when(mockDao.Authenicate("raja", "rani")).thenReturn(true);
		// get actual result 
		String result=LoginService.login("raja", "rani");
		assertEquals("Valid Credintals",result);
	}
	@Test
	public void testLoginWithNonValidCredentials() 
	{
		System.out.println("LoginServiceTest.testLoginWithNoCredentials()");
		// convert mock object to stub object by providing dummy functonality to mock obj methods
		Mockito.when(mockDao.Authenicate("raja", "rani1")).thenReturn(false);
		// get actual result 
		String result=LoginService.login("raja", "rani1");
		assertEquals("Not valid Credintals",result);
	}

	@Test
	public void testLoginWithntValidCredentials() 
	{
	  assertThrows(IllegalArgumentException.class, ()->LoginService.login("", ""));
	}
	@AfterAll
	public static void teardownonce() 
	{
		mockDao=null;	
		LoginService=null;
	}

}
