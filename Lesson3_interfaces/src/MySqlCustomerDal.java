
public class MySqlCustomerDal implements ICustomerDal, IRepository{   //Data access layer -DAL

	@Override
	public void add() {
		System.out.println("Added to MySql!");
		
	} 
	

}
