package in.ashokit.bean;

import in.ashokit.IPayment;

public class PaymentService {
	
	 private IPayment payment;
	  
	 
	 
	  public PaymentService() {
		super();
	
	}



	public PaymentService(IPayment payment) {
		super();
		this.payment = payment;
	}



	public void doPayment( double billAmt) {
		   boolean  status =payment.processPayment(billAmt);
		    if(status) {
		    	System.out.println(" recipt printing");
		    	
		    }else {
		    	System.out.println(" Card Declined");
		    }
		  
	  }

}
