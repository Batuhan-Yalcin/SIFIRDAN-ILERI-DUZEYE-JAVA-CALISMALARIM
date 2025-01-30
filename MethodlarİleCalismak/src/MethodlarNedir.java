
public class MethodlarNedir {

	public static void main(String[] args) {
		
		// SAYI BULAN BİR PROGRAM KODLADIK. VE BU PROGRAMI METHOD HALİNE ÇEVİREREK YAPTIK..
		
	     sayiBulmaca(); // METHODU ÇAĞIRMA 
	   	 mesajVer();

	}
	public static void sayiBulmaca() // STATİC OLAN BİR METHOD TANIMLAMA 
	{
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
			System.out.println("Sayı Mevcuttur " + "Sayı : " + aranacak);
		}
		else {
			System.out.println("Sayı mevcut değildir " + "Sayı : " + aranacak);
		}
		
		
	}
	
	public static void mesajVer()
	{
		System.out.println("Methoddan Geldim.");
	}
}
