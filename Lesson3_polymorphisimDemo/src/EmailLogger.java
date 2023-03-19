
public class EmailLogger extends BaseLogger{
	public void log(String message) {	//override...
		System.out.println("Logged to email: " + message );
	}

}
