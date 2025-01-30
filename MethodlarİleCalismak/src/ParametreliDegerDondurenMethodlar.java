
public class ParametreliDegerDondurenMethodlar {

	public static void main(String[] args) {
		
		int donenDeger = toplamaYap(20, 5);
		
		// Metottan gelen değerleri de böyle kontrol yapabiliriz mesela Bu örnek olarak yapıldı ..
		
		if(donenDeger <30)
		{
			System.out.println("Değer 30'dan Küçüktür Değer : " + donenDeger);
		}
		else {
			System.out.println("Değer 30'dan Büyüktür Değer : " +donenDeger);
		}
		
		// Methoddan gelen değer ile Mini sisteme giriş yapma uygulaması 
	String isimSoyisim = isimSoyisimYazdir("Batuhan", "Yalçın");
		
		if(isimSoyisim.equals("Batuhan Yalçın"))
		{
			System.out.println("Sisteme Başarı İle Giriş Yaptınız.. Adınız Soyadınız : " +isimSoyisim);
		}
		else {
			System.out.println("Başarısız Giriş.. ! ");
		}

	}

	public static int toplamaYap(int s1,int s2)
	{
		int sonuc = s1+s2;
		return sonuc;
	}
	
	public static String isimSoyisimYazdir(String isim, String soyisim)
	{
		return isim + " " +soyisim;
	}
}
