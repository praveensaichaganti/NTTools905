package com.nt.upi;

public class UPIPayment 
{
	public String doUPIPayment(long mobileno,float amount) 
	{
		return amount+"amount is transformed to mobile number"+mobileno+"BharatPe";
		
	}

	public String doUPIByAcno(long accno,float amount) 
	{
		return amount+"amount is transformed to accno number"+accno+"BharatPe";
		
	}

}
