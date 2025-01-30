package Kısım7;

import java.lang.System.Logger.Level;
import java.util.Scanner;


public class Main {

	
	
	enum Level 
		 { 
		  Dusuk,
		  Orta,
		  Yuksek
		  }
	
	public static void main(String[] args) {
	
		Level myVar = Level.Orta; 
		System.out.println(myVar);
		
		
	    myVar = Level.Dusuk;
		System.out.println(myVar);
		
		

//Level enum'ı kullanılarak myVar değişkenine Level.MEDIUM (Orta) değeri atanır ve ekrana yazdırılır.
//Ardından, myVar değişkenine Level.LOW (Düşük) değeri atanır ve tekrar ekrana yazdırılır.
			
		
		
		
		
		
			
		// Kullanıcıdan adını soyadını yaşını alalım
		// Yine kullanıcıdan 2 tane double tipinde sayı alalım 
		// ve bunu ekrana yazdıralım
		
		
		
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Adınızı Girin : ");
		String isim = scann.nextLine();
		
		System.out.println("Soyadınızı Giriniz : ");
		String soyad = scann.next();
		
		System.out.println("Yaşınızı Giriniz : ");
		int yas = scann.nextInt();
		
		System.out.println("Birinci sayıyı giriniz : ");
		double sayi1 = scann.nextDouble();
		
		System.out.println("İkinci sayıyı giriniz : ");
		double sayi2 = scann.nextDouble();
		
		double toplam = sayi1 + sayi2;
		
		System.out.println("Sayıların toplamı : " + toplam);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
