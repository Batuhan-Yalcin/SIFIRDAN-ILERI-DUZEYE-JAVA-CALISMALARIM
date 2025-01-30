package first;



public class Main {

	public static void main(String[] args) {
	
		ProductManager productManager = new ProductManager(); // Ürün yönetimi işlemleri için bir ProductManager nesnesi
		Product product = new Product();  // Yeni bir Product (Ürün) nesnesi 
		
		product.price = 10;
		product.name = "Mause";		
		
		productManager.add(product);  // Ürün bilgileri, ProductManager'ın add() metoduna gönderiliyor

	}

}
