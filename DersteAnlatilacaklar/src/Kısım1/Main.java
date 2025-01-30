package Kısım1;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner giris = new Scanner(System.in);

		System.out.print("Lütfen altılı bir paket için fiyat giriniz: ");
		double paketFiyati = giris.nextDouble();

		

		System.out.print("Lütfen her bir kutunun hacmini giriniz (ons cinsinden): ");
		double kutuHacmi = giris.nextDouble();

		

		final double KUTU_BASI_PAKET = 6;
		double paketHacmi = kutuHacmi * KUTU_BASI_PAKET;
// 		Her bir kutunun hacmi (örneğin: 12 ons) ile bir paketteki 
//		toplam kutu sayısı çarpılarak bir paketin toplam hacmi bulunuyor		

	
		double onsBasinaFiyat = paketFiyati / paketHacmi;
// 		Altılı paketin toplam fiyatını paketin toplam hacmine (ons cinsinden) böleriz
		

		System.out.printf("Ons başına fiyat: %8.2f", onsBasinaFiyat);
		System.out.println();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
		
		
		
		
		
	}

}
