
public class CustomerManager {
	
	private ICustomerDal customerDal;  
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
		
	}
	
	
	
	
	public void add() {	//b�r skicka parametrar 
		// business layer code...
		
		customerDal.add();
	}

}
