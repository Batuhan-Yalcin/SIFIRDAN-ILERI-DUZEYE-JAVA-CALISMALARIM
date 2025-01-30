
public class İfElseİleEnBuyukSayiyiBulmaOrnegi {

	public static void main(String[] args) {
		
		
		int sayi1;
		sayi1 = 10;
		
		int sayi2;
		sayi2 = -15;
		
		int sayi3;
		sayi3 = 5;
		
		if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("Sayı 1 Tüm Sayılardan Büyüktür.");
		}
		else if (sayi2 >sayi1 && sayi2 >sayi3)
		{
			System.out.println("Sayi 2 Tüm sayılardan büyüktür.");
		}
		else {
			System.out.println("Sayı 3 Tüm Sayılardan Büyüktür.");
		}

	}

}
