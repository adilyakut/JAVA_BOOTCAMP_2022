
public class Main {
	
	//logging demo

	public static void main(String[] args) {
		
		/*
		 * BaseLogger [] loggers = new BaseLogger[] {new DatabaseLogger(),new
		 * FileLogger(), new EmailLogger(), new ConsoleLogger()};
		 * 
		 * for (BaseLogger logger : loggers) {
		 * 
		 * logger.log("test messages!");
		 * 
		 * }
		 */
		
	
		
		//EmailLogger logger = new EmailLogger();
		//logger.log("log message!");
		

		CustomerManager customerManager = new CustomerManager(new EmailLogger());
		customerManager.add();
		
	}

}
