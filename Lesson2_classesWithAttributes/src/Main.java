
public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 35000.0, 3, "spaceGrey");
		
		
		System.out.println(product.getCode());
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getName());

	}

}
