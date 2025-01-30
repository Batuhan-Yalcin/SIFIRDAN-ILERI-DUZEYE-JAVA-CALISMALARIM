package HesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir Sayı Giriniz : ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("2. sayıyı giriniz : ");
		int sayi2 = scanner.nextInt();
		
		
		while(true)
		{
			System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
			
			System.out.println("1- Toplama");
			System.out.println("2- Çıkarma");
			System.out.println("3- Çarpma");
			System.out.println("4 - Bölme");
			System.out.println("5 - Çıkış Yap");
			
			int secim = scanner.nextInt();
			System.out.println("Yapmak istediğiniz işlem numarası : " + secim );
			if(secim ==1)
			{
				int toplam = sayi1 + sayi2;
				System.out.println("Toplam Sonucu : " + toplam);
			}
			else if (secim == 2)
			{
				int cikarma = sayi1 - sayi2;
				System.out.println("Çıkarma Sonucu : " + cikarma);
			}
			else if (secim == 3)
			{
				int carpim = sayi1 * sayi2;
				System.out.println("Çarpım sonucu : " + carpim);
			}
			
			else if(secim == 4)
			{
				if(sayi2 != 0)
				{
					int bolum = sayi1 /sayi2;
					System.out.println("Bölüm Sonucu : " + bolum);
				}
				else {
					System.out.println("Hatalı Giriş yaptınız, 0'a bölünemez.");
				}
			
			}
			
			else if (secim == 5) {
			    System.out.println("Çıkış Yapıldı..");
			    break;  
			}
			else {
			    System.out.println("Menüdeki Tuşlamalar Dışında seçim yapamazsınız!");
			}

		}		
	}

}
