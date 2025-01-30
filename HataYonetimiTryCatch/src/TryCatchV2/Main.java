package TryCatchV2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("1. sayıyı giriniz : ");
			int x = scanner.nextInt();
			System.out.println("2. sayıyı giriniz : ");
			int y = scanner.nextInt();
			int sonuc = x/y;
			System.out.println("Sonuç : " + sonuc);
		}
		catch (ArithmeticException exception) {
			System.out.println(exception.getLocalizedMessage());
			System.out.println("0/a bölünemez. " + exception.getMessage());
			exception.printStackTrace();
		}
		catch (InputMismatchException exception) {
			System.out.println("Lütfen bir sayı giriniz ");
		}
		finally {
			scanner.close(); // Finally içerisinde Scanner için oluşturduğu kaynağı geri iade ediyoruz
			// Temizlik işlemi yapıyoruz bi nevi..
		}
		System.out.println("Uygulama Kapandı");
	}
	

}
