
public class MiniProje1 {

	public static void main(String[] args) {
		
		// Girilen Sayı asal mı değil mi hesaplama..
		
		int number = 1;
		int kalan = number % 2 ;	
		boolean asalMi = true; // sayı asaldır dedik.
		
		
		// KONTROLLER..
		if(number == 1) { // Girilen sayı 1 ise 
			System.out.println("Sayı Asal Değildir !!"); // yaz direkt.
		return; // ve döngüyü kır devam et..
	}
		
		if(number <1) // sayı 1 den küçükse
			System.out.println("Geçersiz Sayı.");
		
		// KONTROLLER BİTİŞ..
		
		// HESAPLAMA İŞLEMLERİ..
		
	for(int i = 2; i < number; i++)
	{
		if(number %i == 0)
			asalMi = false; // sayının kendine bölümünden kalan 0 ise sayı asal değildir e çevir false yap..
	}
	
	if (asalMi == true)
	{
		System.out.println("Sayı asaldır.");
	}
	else {
		System.out.println("Sayı asal değildir.");
	}
		
		
		

	}

}
