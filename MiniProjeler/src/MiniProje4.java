import java.util.Iterator;

public class MiniProje4 {

	public static void main(String[] args) {
		
		
		
		// DİZİDE Kİ SAYILARDAN ARANACAK BİR SAYI BELİRLEYECEĞİZ DİZİNİN İÇİNDE VARMI YOK MU BULACAK PROGRAM..
		
		int [] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varmi = false;
		
		for (int sayi : sayilar)
		{
			if(sayi == aranacak)
			{
				varmi = true;
				break;
			}
		}
		
		if (varmi)
		{
			System.out.println("Sayı Mevcuttur.");
		}
		else {
			System.out.println("Sayı mevcut değildir.");
		}
		
		

	}

}
