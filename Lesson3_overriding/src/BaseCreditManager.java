
public class BaseCreditManager {
	
	public double calculate(double amount) {  // public final double calculate(double amount) f�r att hindra override fr�n andra classer!
		return amount * 1.18;
	}

}
