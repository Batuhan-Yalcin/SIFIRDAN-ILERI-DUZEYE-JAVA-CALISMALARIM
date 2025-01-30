
public class DiziNasilKullanilir {

	public static void main(String[] args) {
	
		
		/*
		 Bir Öğretmenin Sınıftaki Öğrencilerinin İsmini Yazdıran Diziyi Kodlayalım.
		 */
		
		// Eskiden olsa ne yapardık String ogr1 = "Batuhan";
		// String ogr2 ="Ahmet"; gibi gibi yapardık ama 100 öğrenci olsa tek tek bunla mı ugrasıcaz hayır tabikide..
		
		// ve diyelim ki aynı isme ait 2 ögrenci var 2 side ahmet biz 1. ahmet üzerinde işlem yapmak istiyoruz 
		// ama 2 ahmet olduğu için 1. ahmeti nasıl bulurduk bu yöntemle gitseydik bulamazzdık ama diziler ile bulabiliriz
		// her bir ismin kendine ait index numarası vardır yani 30 tane de ahmet olsa biz 3. ahmette işlem yapmak istersek
		// 3. ahmetin kendine özel index numarasını çağırıp işlem yapabiliriz..
		
		
		String ogrenciler [] = {"Batuhan","Ahmet","Ali","Ayşe","Şevval","Fatma","Mehmet","Kağan","Hakan","Samet","batuhan"};
		
		// bakın yukarıda 2 adet batuhan var ve ben en başta ki batuhanı yazdırmak istiyorum nasıl yapacağız..
		
		System.out.println(ogrenciler[0]); // 0. index numarasında ki batuhan ı bana getir..
		System.out.println(ogrenciler[10]); // 10. index numarasında ki batuhan ı bana getir..
		
		// Gördüğünüz gibi burada 2 farklı batuhan ile de işlem yapmış olduk. 
		
		// Tüm öğrencileri yazdıralım..
		
		for(int i = 0; i<ogrenciler.length; i++)
		{
			System.out.println(ogrenciler[i]);
		}
		
		// yukarıda şunu yaptık 
		// 0. index numaralı öğrencinin isminden başla öğrenciler dizisinin uzunluğu kadar dön ve her döndüğünde
		// yeni öğrencinin ismini yazdır.

	}

}
