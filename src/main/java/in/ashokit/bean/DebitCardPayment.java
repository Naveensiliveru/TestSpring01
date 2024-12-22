package in.ashokit.bean;

import in.ashokit.IPayment;

public class DebitCardPayment implements IPayment {

	 public DebitCardPayment() {
		 System.out.println(" DebitCardPayment ::Constructor");
	 }
	@Override
	public boolean processPayment(double billAmt) {
System.out.println("DebitCardPayment Sucessful");		
return  true;
	}

}
