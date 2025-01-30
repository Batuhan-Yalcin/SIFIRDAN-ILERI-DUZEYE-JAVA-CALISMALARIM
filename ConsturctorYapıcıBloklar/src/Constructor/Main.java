package Constructor;

public class Main {

	public static void main(String[] args) {
		
		
		Product product = new Product();
		
		
		product.setId(1);
		product.setName("Computer");
		product.setDescription("Samsung");
		product.setPrice(10000);
		product.setRenk("Black");
		product.setStockAmount(2);

		
		System.out.println("Ürünün İd Numarası : " + product.getId());
		System.out.println("Ürünün İsmi : " + product.getName());
		System.out.println("Ürünün Markası : " + product.getDescription());
		System.out.println("Ürünün Fiyatı : " + product.getPrice());
		System.out.println("Ürünün Rengi : " + product.getRenk());
		System.out.println("Ürünün Stok Adedi : " + product.getStockAmount());
		
	}

}
