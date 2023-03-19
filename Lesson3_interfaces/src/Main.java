
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ICustomerDal customerDal = new MySqlCustomerDal(); 		//polymorphism with interface!
		//customerDal.add();
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal()); //med constructor -> koden nedanför behövs inte
		//customerManager.customerDal = new OracleCustomerDal(); // Interface -> OracleCustomerDal eller MySqlCustomerDal
		customerManager.add();

	}

}
