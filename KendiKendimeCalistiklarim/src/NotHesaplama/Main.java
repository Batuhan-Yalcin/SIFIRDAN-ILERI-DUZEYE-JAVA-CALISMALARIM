package NotHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Notunuzu Giriniz : ");
		int birinciNot = scanner.nextInt();
		
		System.out.println("2. Notunuzu Giriniz : ");
		int ikinciNot = scanner.nextInt();
		
		System.out.println("3. Notunuzu Giriniz : ");
		int ucuncuNot = scanner.nextInt();
			
		ortalama(birinciNot, ikinciNot, ucuncuNot);
		
	}

	public static void ortalama(double sayi1, double sayi2,double sayi3)
	{
		double ortalama = (sayi1+ sayi2 + sayi3)/3;
		if(ortalama >50)
		{
			System.out.println("Geçtiniz Ortalamanız : " + ortalama);
		}
		else {
			System.out.println("Kaldınız Ortalamanız : " + ortalama);
		}
			
	}
}
