public class ProductValidator {
	
	public ProductValidator() {
		System.out.println("constructor block");
	}
	
	static {
		System.out.println("Static constructor block");
	}
	
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void something() {
		
	}
	/*
	 * public static class StaticInnerclass{ //huvudklassen kan inte vara statisk,
	 * men innerklassen kan! public static void delete() {
	 * 
	 * } }
	 */
}
