
public class Stringİfadeler2 {

	public static void main(String[] args) {
		
		
		
		String mesaj = "      Bugün Hava Çok Güzel.       ";
		System.out.println(mesaj);
		
		//replace değiştirmek demektir Bugün hava Çok güzel metninde ki boşlukları - ile değiştirdim 
		// Çıktı : Bugün-Hava-Çok-Güzel. oldu..
		String yenimesaj = mesaj.replace(' ', '-');
		System.out.println(yenimesaj);

		
		// BİR METNİN İÇERİSİNDEN PARÇA ALIR YANİ MESAJIN 2. İNDEXİNDEN GERİDEN İTİBAREN PARÇALAR METNİ KESER..
		System.out.println(mesaj.substring(2)); // ÇIKTI : gün Hava Çok Güzel.
		System.out.println(mesaj.substring(2,5)); // 2 den başla 5. indexe kadar kes Çıktı : gün
		
		
		// SPLİT Fonksiyonu Bir Cümledeki Kelimeleri Ayırmaya Yarar kelime kelime ayırır.
		for(String kelime : mesaj.split(" "))
		{
			System.out.println(kelime); // Çıktı : Bugün Alta geçti  Hava  alta geçti   Çok  alta geçti  güzel. alt alta yazdı
										// Hepsini..
		}
		
		// Benim mesajımdaki tüm harfleri küçük harfe çevirdi çıktı : bugün hava çok güzel.
		System.out.println(mesaj.toLowerCase());
		
		// Benim mesajımdaki tüm harfleri Büyük harfe çevirdi Çıktı : BUGÜN HAVA ÇOK GÜZEL.
		System.out.println(mesaj.toUpperCase());
		
		// Kelimenin Başındaki ve sonunda ki  tüm boşlukları siler..
		System.out.println(mesaj.trim());
		
		
		
	}

}
