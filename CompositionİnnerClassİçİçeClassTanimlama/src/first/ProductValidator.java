package first;

public class ProductValidator {
	
	static {
		System.out.println("Static Yapıcı Method çalıştı.");
	}
	
	public ProductValidator()
	{
		System.out.println("Yapıcı Method çalıştı.");
	}
	
	
	
	public static boolean isValid(Product product) // Ürün geçerlilik kontrolü
	{
		if(product.price > 0 && !product.name.isEmpty())
		{
			return true; // Ürün geçerliyse true döndür
		}
		else {
			return false; // Ürün geçerli değilse false döndür
		}
	}
	
	public void bisey()
	{
		
	}
	
	public class BaskaBirClass{
		public static void Sil()
		{
			
		}
	}
	// İnner Class
	
}
