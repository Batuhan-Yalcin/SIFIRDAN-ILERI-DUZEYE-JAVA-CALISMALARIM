import java.text.BreakIterator;
import java.util.Scanner;

public class SwitchCaseİleKullanicinGirdiğiSayidanBuyukOlaniBulma {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen 1. Sayıyı Giriniz : ");
		int birinciSayi = scanner.nextInt();
		
		System.out.println("Lütfen 2. Sayıyı Giriniz : ");
		int ikinciSayi = scanner.nextInt();
		
		System.out.println("Lütfen 3. Sayıyı Giriniz : ");
		int ucuncuSayi = scanner.nextInt();
		
		switch(0)
		{
		case 0:
			if(birinciSayi >ikinciSayi && birinciSayi>ucuncuSayi)
				System.out.println("Birinci Sayı Daha Büyüktür.");
			
		case 1 :
			if(ikinciSayi > birinciSayi && ikinciSayi>ucuncuSayi)
				System.out.println("İkinci Sayı Daha Büyüktür.");
			
			
		case 2:
			if(ucuncuSayi >birinciSayi&& ucuncuSayi>ikinciSayi)
				System.out.println("Üçüncü Sayı Daha Büyüktür.");
		break;
		}
	
		scanner.close();
		

	}

}
