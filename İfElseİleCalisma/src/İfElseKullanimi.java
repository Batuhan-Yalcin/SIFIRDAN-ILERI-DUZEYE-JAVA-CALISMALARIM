
public class İfElseKullanimi {

	public static void main(String[] args) {
		
		// İf Eğer else değilse demek
		// Biz bu örneğimizde Bir Otobüs değişkeni Oluşturduk ve otobüsün Gayrettepe otobüsü olduğunu belirttik.
		// Daha sonrasında Eğer Otobüs Sancakktepe otobüsü değerine eşitse 
		// Bu otobüs sancaktepe otobüsüdür yaz dedik.
		// Değilse Bu otobüs Gayrettepe otobüsüdür yaz dedik.
		
		String otobus = "Gayrettepe Otobüsü";
	
		if (otobus == "Sancaktepe Otobüsü")
		{
			System.out.println("Evet Bu Otobüs Sancaktepe Otobüsüdür.");
		}
		else {
			System.out.println("Hayır Bu Otobüs Gayrettepe Otobüsüdür.");
		}
		
		
		
	}

}
