
public class Main {

	public static void main(String[] args) {
		char charToCheck = 'A';

		if (charToCheck == 'A' || charToCheck == 'a' || charToCheck == 'E' || charToCheck == 'e' || charToCheck == 'I'
				|| charToCheck == 'i' || charToCheck == 'O' || charToCheck == 'o' || charToCheck == 'U'
				|| charToCheck == 'u') {
			System.out.println(charToCheck + ": is vowel");
		}
		else {
			System.out.println(charToCheck + ": is a consonant");
		}

	}

}
