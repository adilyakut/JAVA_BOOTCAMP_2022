
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.name = "Laptop";
		product.price = 1200.0;
		product.id = 124;
		manager.add(product);
		
		DatabaseHelper.Crud.delete(); // smidig användning av innerclass men inte rekomenderad ! 
	}

}
