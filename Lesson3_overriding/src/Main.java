
public class Main {

	public static void main(String[] args) {

		BaseCreditManager[] creditManagers = new BaseCreditManager[] {new StudentCreditManager(),new SeniorCreditManager(),new GoldMemberCreditManager()};
		
		for (BaseCreditManager creditManager : creditManagers) {
				System.out.println(creditManager.calculate(1000));
		}
	}

}
