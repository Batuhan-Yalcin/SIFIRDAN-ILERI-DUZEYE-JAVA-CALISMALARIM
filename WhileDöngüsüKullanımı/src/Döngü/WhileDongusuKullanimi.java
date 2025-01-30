package Döngü;

public class WhileDongusuKullanimi {

	public static void main(String[] args) {
	
		// For Döngüsünden Farklı olarak burada başlangıcı dışarıda belirtiriz.
		// Koşulumuuzu While ın parantezine yazarız.
		// Ekrana yazdırma işlemimizi gerçekleştiririz.
		// en sonunda da arttırma - azaltma işlemimizi uygularız..
		
		// 1 den 50 ye kadar olan sayıları yazdıran while döngüsü
		int i =1;
		
		while (i<50)
		{
			System.out.println(i);
			i++;
		}
		
		// 0 dan 10 a kadar  Ekrana  Batuhan  yazdıran  döngü 
		
		int a = 0;
		while (a<10) {
			System.out.println("Batuhan "+a);
			a++;
		}
		
		
		
	}

}
