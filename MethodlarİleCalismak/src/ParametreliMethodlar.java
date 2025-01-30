
public class ParametreliMethodlar {

	public static void main(String[] args) {
		
		ekle();
		sil();
		guncelle();
		int sayi = topla(5, 7);
		System.out.println(sayi);
		System.out.println(sehirVer());
		int toplam = topla2(2,3,4,5,6,7,8,9,10);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("SAYI 5");
		System.out.println("5 SAYISI 1 SAYISI İLE TOPLANDI ");
	}
	public static void sil() {
		System.out.println("MEVCUT SAYIDAN 1 SİLİNDİ ");
	}
	public static void guncelle() {
		System.out.println("GÜNCEL SAYI : 5 ");
	}
	public static String sehirVer()
	{
		return "İstanbul";
	}
	// PARAMETRELİ METHODLAR..
	public static int topla(int sayi1 , int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) // Birden fazla parametre göndereceğimi belirtiyorum.
	{
		int toplam =0;
		for(int sayi : sayilar)
		{
			toplam+=sayi;
		}
		return toplam;
	}
	
}
