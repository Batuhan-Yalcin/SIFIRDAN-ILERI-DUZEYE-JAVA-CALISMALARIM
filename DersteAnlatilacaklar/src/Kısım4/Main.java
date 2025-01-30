package Kısım4;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		/*
		Scanner read = new Scanner(System.in);
		System.out.print("Notunuzu girin: ");
		String not = read.next();
		System.out.println("...");
		int devamsizlik = read.nextInt();

		
		switch (not)
		{
		case  "AA"  :
			System.out.println("Mükkemel");
			break;
		case "BB" : 
			System.out.println("AFFERİN.");
			break;
		case "CC" :
			System.out.println("Yeter, Tembellik etme");
			break;
		case "DD" : 
			System.out.println("Geçtin..");
			break;
		case "FF" : 
			System.out.println("Bir dahaki sefere daha iyisini yapmaya çalış");
			break;
			default : 
				System.out.println("Geçersiz Not..");
		}
		
		System.out.println("Girdiğiniz not: " + not);
			*/
		
		
		
		
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci Sayıyı Giriniz : ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("İkinci Sayıyı Giriniz : ");
		int sayi2 = scanner.nextInt();
		
		int toplam = sayi1 +sayi2;
		
		switch(toplam)
		{
		case 100 :
		System.out.println("Toplam 100dür");
		break;
		case 90 :
			System.out.println("Toplam 90dır");
			break;
		case 80 : 
			System.out.println("Toplam 80dir");
			break;
			default :
				System.out.println("Hiçbiri Değildir..");
				
		}
		
		System.out.println("Girdiğiniz değerlerin toplamı : " + toplam);
		
		
		
		
		
		
		
		
		
		
		
	}

}
