package first;

public class ProductManager {

	public void add(Product product)
	{
		
		try {
			if(ProductValidator.isValid(product)) // Ürün geçerli mi kontrolü.
			{
				System.out.println("Ürün Bilgileri Eklendi."); // Geçerliyse bu mesaj 
			}
			else {
				System.out.println("Ürün Bilgileri Geçersizdir ! "); // Geçerli değilse bu mesaj
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
