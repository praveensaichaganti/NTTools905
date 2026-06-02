package com.nt.nb;

public class NetBankingService 
{
	public String TransferMoney(long srcAcno,long destacno,double amt,String gateway) 
	{
		return amt+"amount is transfereed from "+srcAcno+"to"+destacno+"using gateway"+gateway;
		
	}

}
