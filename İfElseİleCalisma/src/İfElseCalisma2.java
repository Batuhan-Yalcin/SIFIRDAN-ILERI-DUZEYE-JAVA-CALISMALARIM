
public class İfElseCalisma2 {

	public static void main(String[] args) {
		
		// Bu örneğimizde kitapsayisi değişkenimize 560 değerini verdik
		// Ve dedik ki eğer kitapsayısı 560 ise 560dır yaz else if ile 2. koşul u koyduk
		// 500 ise 500dür yaz bunlardan hiçbiri değilse Hiç kitap yoktur yazdır dedik.
		
		int kutuphaneKitapSayisi = 560;
		
		if (kutuphaneKitapSayisi ==560 )
		{
			System.out.println("Kütüphanedeki Kitap Sayısı 560'tır.");
		}
		else if ( kutuphaneKitapSayisi == 500)
		{
			System.out.println("Kütüphanedeki Kitap Sayısı 500'dür");
		}
		else {
			System.out.println("Kütüphanede Hiç Kitap Yoktur.");
		}
		
		
	}

}
