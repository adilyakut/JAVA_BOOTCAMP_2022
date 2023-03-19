
public class ProductManager {
	
	public void add(Product product) {
		//ProductValidator productValidator = new ProductValidator();
		
		if (ProductValidator.isValid(product)) {	//static productValidator utan rad 5! ingen new...
			System.out.println("has been added");

		}else {
			System.out.println("something went wrong under add progress! ");

		}
		
		// för att använda icke static  something() från ProductValidator bör rad 5 avkommenteras! new vid det fallet!
		
	}

}
