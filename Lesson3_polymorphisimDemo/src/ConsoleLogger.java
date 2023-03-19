
public class ConsoleLogger extends BaseLogger{
	public void log(String message) {	//override...
		System.out.println("Logged to console: " + message );
	}


}
