package Kısım5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Kat: ");
		int kat = in.nextInt(); 

		// Katı gerekirse ayarla

		int gercekKat;
		if (kat > 13)
		{  
		    gercekKat = kat - 1; // kat 13 den büyükse 1 düşür 
		}
		else
		{
		    gercekKat = kat;
		}

		System.out.println("Asansör gerçek kat " + gercekKat + "\'a gidecek.");
		
		
		

	}

}
