import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		
		HashMap<String,String> sozluk = new HashMap<String, String>();
		
		sozluk.put("book", "Kitap");
		sozluk.put("Table", "Masa");
		sozluk.put("Computer", "Bilgisayar");
		System.out.println(sozluk.size()); // HashMapde kaç eleman olduğunu gösterir.
		
		for(String Sozluk : sozluk.keySet()) // keySet ile listeleriz Diğerlerinden farklı olarak
		{
			System.out.println("Eleman : " + Sozluk + "Değer : " +sozluk.get(Sozluk)); // Tüm elemanları Gezer
		//	System.out.println(Sozluk); // Değerleri Gezer
		//    System.out.println(sozluk); // Hepsini gezer.
		}
		
		sozluk.remove("Table"); // Sadece Table 'ı siler.
		System.out.println(sozluk.get("Table")); // Sağ Taraf Değer Sol Taraf anahtar görevi görür.
		// Table'ı çağırınca masa çıktısını alırız.
		
		//	sozluk.clear(); // Tüm sözlüğü siler.
		
		
		
	}

}
