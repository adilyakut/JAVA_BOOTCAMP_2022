
public class BaseCreditManager {
	
	public double calculate(double amount) {  // public final double calculate(double amount) för att hindra override från andra classer!
		return amount * 1.18;
	}

}
