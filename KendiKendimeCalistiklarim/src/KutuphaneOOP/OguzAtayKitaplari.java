package KutuphaneOOP;

import java.util.ArrayList;

public class OguzAtayKitaplari extends Kitap {

	ArrayList <String> kitapListesi = new ArrayList<String>();
	
	public void kitapEkle(String ...kitaplar) {
		
		for(String kitap : kitaplar)
		{
			kitapListesi.add(kitap);
			System.out.println("Kitap Eklendi : " + kitap);
		}
		
	}

	
	public void kitapSil(String... kitaplar) {
		
		for(String kitap : kitaplar)
		{
			kitapListesi.remove(kitap);
			System.out.println("Kitap Silindi : " + kitap);
		}
	}


	public void kitapListele() {
		System.out.println("Listedeki kitaplar : " );
		for(String kitaplar : kitapListesi)
		{
			System.out.println(kitaplar);
		}
		
	}


	
	
	

}
