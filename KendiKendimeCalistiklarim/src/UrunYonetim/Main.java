package UrunYonetim;

public class Main {

	public static void main(String[] args) {
		
		
		Urun urun = new Urun();
		
		System.out.println("------------------------------");
		urun.urunEkle("Bilgisayar");
		urun.urunEkle("Klavye");
		urun.urunEkle("Mause");
		System.out.println("------------------------------");
		urun.urunSil("Bilgisayar");
		System.out.println("------------------------------");
		urun.urunListele();
		
		
	}

}
