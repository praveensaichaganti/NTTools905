package com.nt.service;

import com.nt.dao.ILoginDAO;

public class LoginMgmtServiceImpl implements ILoginMgmtService 
{
  private ILoginDAO loginDAO;
  
  public LoginMgmtServiceImpl(ILoginDAO loginDAO) 
  {
	this.loginDAO=loginDAO;
  }
	
	@Override
	public String login(String username, String pwd) 
	{
		if(username.equals("")||username.length()==0||pwd.equals("")||pwd.length()==0)
			throw new IllegalArgumentException("Invalid Input");
		//use DAO
		boolean flag=loginDAO.Authenicate(username, pwd);
		if(flag)
			return "Valid Credintals";
		else
			return "Not valid Credintals";
	}

}
