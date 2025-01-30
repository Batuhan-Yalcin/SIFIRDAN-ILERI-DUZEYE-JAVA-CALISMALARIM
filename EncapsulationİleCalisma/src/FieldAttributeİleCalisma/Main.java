package FieldAttributeİleCalisma;

public class Main {

	public static void main(String[] args) {
		
		
		Product product = new Product();
	
		product.id = 1;
		product.name = "Laptop";
		product.description ="Monster Laptop";
		product.price = 15000;
		product.stockAmount = 20;
		
		ProductManager productManager = new ProductManager();
		
		productManager.Add(product);
	}
}
