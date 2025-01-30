package OgrenciDersNotlarıOOP;

public class Main {

	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci("Batuhan", "Yalçın");
		
		ogrenci.dersEkle("Java İle Programlama","Programlama Temelleri","Python","Web Tasarım");
		System.out.println("****************************************************");
		ogrenci.ogrenciBilgileriGoster();
		System.out.println("****************************************************");
		ogrenci.dersleriGoster();
	}

}
