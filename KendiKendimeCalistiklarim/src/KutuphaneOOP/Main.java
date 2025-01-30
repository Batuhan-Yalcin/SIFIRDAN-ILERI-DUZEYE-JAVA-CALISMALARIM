package KutuphaneOOP;

public class Main {

	public static void main(String[] args) {
	
		Kitap kitap = new OguzAtayKitaplari();
		
		kitap.kitapEkle("Tutunamayanlar", "Tehlikeli Oyunlar","Korkuyu Beklerken","Oyunlarla Yaşayanlar");
		kitap.kitapListele();
		kitap.kitapSil("Tutunamayanlar", "Tehlikeli Oyunlar");
		kitap.kitapListele();
	}

}
