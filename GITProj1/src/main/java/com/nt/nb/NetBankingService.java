package com.nt.nb;

public class NetBankingService 
{
	// for net banking 
	public String TransferMoney(long srcAcno,long destacno,double amt,String gateway) 
	{
		System.out.println("NetBankingService.TransferMoney()");
		return amt+"amount is transfereed from "+srcAcno+"to"+destacno+"using gateway"+gateway;
		
	}

}
