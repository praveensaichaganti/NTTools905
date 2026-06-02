package com.nt.main;

import com.nt.nb.NetBankingService;
import com.nt.service.ArithmeticOperations;
import com.nt.upi.UPIPayment;

public class AppTest 
{
	public static void main(String[] args) {
		ArithmeticOperations ops=new ArithmeticOperations();
		System.out.println("Result(sum)is::"+ops.sum(10, 20));
		System.out.println("Result(sub)is::"+ops.sub(20,40));
		
		System.out.println("=================================");
		UPIPayment upiip=new UPIPayment();
		System.out.println(upiip.doUPIPayment(99999999L, 10000.0f));
		
		System.out.println("=================================");
		System.out.println(upiip.doUPIByAcno(99999999L, 2000.0f));
		
		System.out.println("=====================================");
		NetBankingService service=new NetBankingService();
		String msg=service.TransferMoney(4545454545l, 98989898998l, 5455.0f);
		System.out.println(msg);
	}

}
