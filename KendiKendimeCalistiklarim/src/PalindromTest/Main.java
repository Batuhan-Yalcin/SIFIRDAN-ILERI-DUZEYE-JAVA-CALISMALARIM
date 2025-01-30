package PalindromTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Palindrom Oyununa Hoşgeldiniz..");
		System.out.println("Palindrom : Girdiğiniz Kelimenin Tersten okunuşu ile Baştan okunuşu aynı ise olan değerlerdir.");
		System.out.println("Bir Kelime Giriniz..");
		String kelime = scanner.nextLine();
		
		StringBuilder sb = new StringBuilder(kelime);
		String tersKelime = sb.reverse().toString();
		
		if(kelime.equals(tersKelime))
		{
			System.out.println(kelime + " " + "Bir palindromdur..");
		}
		else {
			System.out.println("Bir palindrom değildir..");
		}
	}

}
