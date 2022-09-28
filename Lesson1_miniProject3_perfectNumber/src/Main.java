
public class Main {

	public static void main(String[] args) {
		int number = 1;	// enter value greater then 0
		int sum = 0;
		
		for(int i = 1; i<number; i++) {
			if(number % i == 0) {
				sum = sum + i;
			}
			
		}
		
		if(number == sum || number == 1) {
			System.out.println( number +": is perfect number");
		}
		else {
			System.out.println( number +": is NOT perfect number");

		}

	}

}
