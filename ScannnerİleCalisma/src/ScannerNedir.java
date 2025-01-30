import java.util.Scanner;

public class ScannerNedir {

	public static void main(String[] args) {
		
		// Scanner Javada Yazılı Bir Çok Kütüphaneden Birisidir.
		// İşlevi ise Kullanıcıdan Değerler Alır.
		// Yani Biz Scanner Kütüphanesini Kullandığımızda Kullanıcı bir değer girer
		// Biz Girmeyiz..
		
		Scanner scanner = new Scanner(System.in); // Kullanıcıdan değer alacağımı belirttiğim kod.
		
		System.out.println("Lütfen Bir Sayı Giriniz : "); // Kullanıcıya Sorduğum soru.
		int girilenSayi = scanner.nextInt(); // Kullanıcının Girdiği Değeri Yakalama..
		
		System.out.println("Girdiğiniz Sayı : " +girilenSayi); // Kullanıcının Girdiği değeri ekrana yazdırma.
		
		

	}

}
