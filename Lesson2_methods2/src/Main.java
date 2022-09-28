import javax.management.ValueExp;

public class Main {

	public static void main(String[] args) {
		String testMsgString = city();
		System.out.println(testMsgString);
		System.out.println(sum(5, 2));
		System.out.println(sum(3,4,3));

	}

	public static void create() {
		System.out.println("Created");
	}

	public static void delete() {
		System.out.println("Deleted");

	}

	public static void update() {
		System.out.println("Updated");

	}

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int sum(int... numbers) {		// hard to test in more complex systems
		int total = 0;
		for (int number : numbers) {
			total = total + number;
			
		}
		return total;
	}
	
	

	public static String city() {
		return "Ankara";
	}

}
