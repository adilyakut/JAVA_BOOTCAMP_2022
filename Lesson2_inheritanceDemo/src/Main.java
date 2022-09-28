
public class Main {

	public static void main(String[] args) {

		//EducationCreditManager educationCreditManager = new EducationCreditManager();
		//educationCreditManager.Calculate();
		
		CreditUI creditUI = new CreditUI();
		creditUI.CreditCalculate(new EducationCreditManager());
		
	}

}
