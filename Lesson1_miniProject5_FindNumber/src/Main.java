
public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int findNumber = 3;
		boolean isNumberInArray = false;
		
		
		for (int number : numbers) {
			if(number == findNumber) {
				isNumberInArray = true;
				break;
		
			}
			
		}
		
		if(isNumberInArray) {
			System.out.println("your number is in the array!");

		}
		else {
			System.out.println("could not find your number");
		}
	}

}
