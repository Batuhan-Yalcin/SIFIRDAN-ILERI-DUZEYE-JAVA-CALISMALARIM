
public class Stringİfadeler {

	public static void main(String[] args) {
		
		
		String mesaj = "Bugün Hava Çok Güzel";
		System.out.println(mesaj);
		
		// Bugün hava çok güzel in kaç elemanlı bir ifade olduğunu belirtir .length.
		System.out.println("Eleman Sayısı : "+mesaj.length());
		
		// Bugün hava çok güzel in 4. Elemanını ekrana yazdırır. Çıktı = n olur 0. indexten başlar ..
		System.out.println("5. eleman : " + mesaj.charAt(4));

		// İlk yazdığım Bugün hava çok güzel i Yaşasın kelimesi ile birleştirir. Çıktı : Bugün hava çok güzel yaşasın olur
		System.out.println(mesaj.concat(" Yaşasın "));
		
		// Kelimemiz B ile başlıyorsa True döndürür başlamıyor ise False Döndürür.. İlk kelimeye Sorgulama yapar yani.
		System.out.println(mesaj.startsWith("B"));
		
		// Son kelime l ise true döndürür değil ise false döndürür.. Son kelimeye sorgulama yapar yani..
		System.out.println(mesaj.endsWith("l"));
		
		
		// Getchars 0 dan başla 5 tane kelimeyi dahil et karakterler dizisinin içerisinden çek ve 0 dan dahil et anlamı..
		char [] karakterler = new char [5];
		mesaj.getChars(0, 5, karakterler, 0);
		
		System.out.println(karakterler); // Çıktı : Bugün
		
		// Bugün hava çok güzelde ki ilk a nın kaçıncı index numarası olduğunu gösterir Çıktı : 7 
		System.out.println(mesaj.indexOf('a'));
		
		// Aynı indexOf gibidir ama indexOf soldan başlar aramaya bu ise sağdan başlar L harfinden başlar yani.
		// İezüg koç avah bu harflerle ilerler tersten gibi düşünebiliriz 
		System.out.println(mesaj.lastIndexOf('e')); // Çıktı : 18 
		
		
		
	}
}
