
public class Main {

	public static void main(String[] args) {
		int number = 6;	// enter value greater then 0
		int sum = 0;
		
		for(int i = 1; i<number; i++) {
			if(number % i == 0) {
				sum = sum + i;
			}
			
		}
		
		if(number == sum) {
			System.out.println( number +": is perfect number");
		}
		else {
			System.out.println( number +": is NOT perfect number");

		}

	}

}
