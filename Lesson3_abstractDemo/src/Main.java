
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabaseManager(); // utan denna raden null pointer fel, skapar plats i heap f�r funktionalitet. v�lj mellan child till baseDatabase
		customerManager.getCustomers();

	}

}
