package in.ashokit.bean;

import in.ashokit.IPayment;

public class CreditCardPayment implements IPayment{
	
 public CreditCardPayment() {
	 System.out.println("CreditCardPayment :: constructor");
 }
 
	
	
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Debit Card Payment sucessful ");
		return  true;
	}

}
