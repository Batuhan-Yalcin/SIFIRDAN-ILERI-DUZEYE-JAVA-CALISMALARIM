package Kısım2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		/*
		Scanner giris = new Scanner(System.in);
		System.out.print("n1 için bir tam sayı girin: ");
		
		int n1 = giris.nextInt();
		
		System.out.print("n2 için bir tam sayı girin: ");
		
		int n2 = giris.nextInt(); 

		if (n1 > n2)
		    System.out.println(n1 + " > " + n2);
		
			
		
		if (n1 < n2)
		    System.out.println(n1 + " < " + n2); 
		
		if (n1 == n2) 
		    System.out.println(n1 + " = " + n2);
		
		if (n1 >= n2) 
		    System.out.println(n1 + " >= " + n2);
		
		if (n1 <= n2)
		    System.out.println(n1 + " <= " + n2);

		
		*/
		
		
		
		
		
		
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Adınızı Giriniz : ");
		String isim = scann.nextLine();
		
		System.out.println("Yaşınızı Giriniz : ");
		int yas = scann.nextInt();
		
		System.out.println("1. Sayıyı Giriniz : ");
		double sayi1 = scann.nextDouble();
		
		System.out.println("2. Sayıyı Giriniz : ");
		double sayi2 = scann.nextDouble();
		
		if(sayi1 >= sayi2)
		System.out.println("Sayı 1 sayı 2 den büyük veya eşittir.");	
		
		
			if(sayi2 >= sayi1)
				System.out.println("Sayı 2 sayı 1 den büyük veya eşittir.");
		
		if(sayi2 >= sayi1)
		System.out.println("Sayı 2 sayı 1 den büyük veya eşittir.");	
		
		if (sayi1 < sayi2)
			System.out.println("Sayı 1 küçüktür sayı 2 den ");
		
		if(sayi2 < sayi1)
		System.out.println("Sayı 2 sayı 1 den küçüktür.");	
		
		else
		System.out.println("Sayılar eşittir.");
		
		
		
		// eğer sayı1 sayı 2 den küçükse onu yazdır
		// eğer sayı2 sayı 1 den küçükse onu yazdır
		// eğer sayı 1 sayı 2 ye eşitse onu yazdır
		
		
		
		
				
			
			
				
					
				
		
		

	}

}
