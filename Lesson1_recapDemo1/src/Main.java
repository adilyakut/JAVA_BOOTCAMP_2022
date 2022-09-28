
public class Main {

	public static void main(String[] args) {
		int number1, number2, number3;
		number1 = 20;
		number2 = 25;
		number3 = 2;
		
		int greatestNumber = number1;
		
		if(greatestNumber<number2) {
			greatestNumber = number2;
		}
		
		if(greatestNumber<number3) {
			greatestNumber = number3;
		}
		
		System.out.println("The greatest number is :" + greatestNumber);
		
		
		
	}

}
