package SayiTahminEtmece;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tahminSayisi =0;
		Random random = new Random();
		int rastgele = random.nextInt(100)+1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 ile 100 Arasında Bir Sayı Tuttum Hadi Tahmin et bakalım..");
		while(true) {
			tahminSayisi++;
			System.out.println("Tahmininizi Giriniz : ");
			int tahmin = scanner.nextInt();
			
			if(tahmin  < rastgele)
			{
				System.out.println("Yaklaştın Tahmin değerin Aklımda ki sayıdan küçük..");
			}
			else if (tahmin > rastgele)
			{
				System.out.println("Yaklaştın.. Tahmin değerin aklımda ki sayıdan büyük");
			}
			else if (tahmin == rastgele)
			{
				System.out.println("Tebrikler Doğru Tahmin..");
				System.out.println("Toplam " + tahminSayisi + " tahminde doğru buldun.");
				break;
			}
			
			else {
				System.out.println("Girdiğin Sayı 0 ile 100 arasında değil ! ");
			}
			
			
		}
		
	}

}
