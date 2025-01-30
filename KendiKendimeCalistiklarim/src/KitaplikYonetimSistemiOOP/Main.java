package KitaplikYonetimSistemiOOP;

public class Main {

	public static void main(String[] args) {
	
		KitapYonetim yonetim = new KitapYonetim();
		
		yonetim.kitapEkle("Tutunamayanlar", 50, 2021);
		yonetim.kitapEkle("Aşık Ve Tutsak", 100, 2024);
		yonetim.kitapEkle("Pembe Roman", 300, 2024);
		System.out.println("----------------");
		yonetim.kitapListele();
		System.out.println("----------------");
		yonetim.kitapSil("Aşık Ve Tutsak");
		System.out.println("----------------");
		yonetim.kitaplariFiyataGoreSirala();
	}

}
