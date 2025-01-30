package Kısım3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner giris = new Scanner(System.in);

		System.out.print("Birinci tam sayı: ");
		int a = giris.nextInt();

		System.out.print("İkinci tam sayı: ");
		int b = giris.nextInt();

		System.out.print("Üçüncü tam sayı: ");
		int c = giris.nextInt();

	
//		int min = a;
//		
//		if (b < min)
//		    min = b;
//		if (c < min)
//		    min = c;
//
//		int max = a;
//		if (b > max)
//		    max = b;
//		if (c > max)
//		    max = c;

//		System.out.printf("Minimum: %5d  ve Maksimum: %5d", min, max);
//		System.out.println();

		
		
		
		
		int min2 = Math.max(a, b);
		min2 = Math.min(min2, c); // daha sonra c dahil edilir. min2 de ki sonuç c den büyükse
		// min 2 c olur değilse min2 aynı kalır

		int max2 = Math.max(a, b);
		max2 = Math.max(max2, c);

		System.out.printf("Minimum: %5d  ve Maksimum: %5d", min2, max2);

		
		
		

	}

}
