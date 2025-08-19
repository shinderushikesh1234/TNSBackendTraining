package com.tnsif.interfacedemo;

public interface Payment {
   
	void payment();
	
	default void PaymentReceipt(double amt)
	{
		System.out.println("Received Payment of " + amt);
	}
	
}
