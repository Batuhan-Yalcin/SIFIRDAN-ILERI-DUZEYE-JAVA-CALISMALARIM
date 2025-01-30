package GelecegiYazanlarException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
	
		arithExcep();
		 arrayExcep();
		nullPointerExcep();
			
		
		
	}
	public static void arithExcep()
	{
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Bir sayı giriniz : ");
		int sayi1 = scanner.nextInt();
		System.out.println("2. Sayıyı giriniz : ");
		int sayi2 = scanner.nextInt();
		System.out.println(sayi1/sayi2);
	}

	public static void arrayExcep()
	{
		int [] numbers = {0,1,2,3,4};
		Scanner scanner = new Scanner(System.in);
		int index =  scanner.nextInt();
		System.out.println(numbers[index]);
	}
	
	public static void nullPointerExcep()
	{
		Scanner scanner = null;
		String line = scanner.nextLine();
		System.out.println(line);
	}
}
