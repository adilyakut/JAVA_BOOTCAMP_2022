
public class Main {
	public static void main(String[] args) {
		findNumber();
	
	}
	
	
	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int findNumber = 2;
		boolean isNumberInArray = false;

		for (int number : numbers) {
			if (number == findNumber) {
				isNumberInArray = true;
				break;

			}

		}

		if (isNumberInArray) {
			System.out.println("your number is in the array!");
			sendMessage(findNumber);

		} else {
			System.out.println("could not find your number");
		}
	}
	
	public static void sendMessage(int findNumber) {
		System.out.println("your number is in the array! " + findNumber);
	}

}
