
public class Main {

	public static void main(String[] args) {
		// isPrimeNumber

		int number = 2;
		boolean isPrime = true;
		
		if(number < 2) {
			isPrime = false;
		}

		for (int i = 2; i < number; i++) {
			
			if (number % i == 0) {
				isPrime = false;

			}

		}
		if (isPrime) {

			System.out.println(number + " is a prime number");

		}

		if (!isPrime) {

			System.out.println(number + " is NOT a prime number");

		}

	}

}
