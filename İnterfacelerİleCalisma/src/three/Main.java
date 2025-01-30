package three;

import java.io.ObjectInputStream.GetField;

public class Main {

	public static void main(String[] args) {


		Elma [] elmalar = new Elma [10];
		
		elmalar [0] = new Elma(10,"Sarı");
		elmalar [1] = new Elma(20,"Yeşil");
		elmalar [2] = new Elma(30,"Sarı");
		elmalar [3] = new Elma(40,"Yeşil");
		elmalar [4] = new Elma(50,"Kırmızı");
		elmalar [5] = new Elma(60,"Yeşil");
		elmalar [6] = new Elma(70,"Sarı");
		elmalar [7] = new Elma(80,"Yeşil");
		elmalar [8] = new Elma(90,"Kırmızı");
		elmalar [9] = new Elma(100,"Yeşil");
		
		/*
		renkFiltrele("Sarı", elmalar);
		System.out.println("-----------");
		agirlikFiltrele(50, elmalar);
		System.out.println("-----------");
		agirlikFiltrele2(50, elmalar);
		System.out.println("-----------");
		*/
	//	RenkFiltresi renkFiltresi = new RenkFiltresi();
	//	AgirlikFiltresi agirlikFiltresi = new AgirlikFiltresi();
		
		IElmaFiltresi elmaFiltresi  = new AgirlikFiltresi();
		filtrele(elmaFiltresi, elmalar);
		
	}
	public static void renkFiltrele(String renk, Elma [] elmalar)
	{
		for (int i = 0; i < elmalar.length; i++) {
		Elma elma = 	elmalar[i];
		if(elma.getRenk().equals(renk))
		{
			System.out.println(elma.getRenk() + " " + elma.getAgirlik());
		}
		}
	}
	
	public static void agirlikFiltrele(int agirlik , Elma [] elmalar)
	{
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if(elma.getAgirlik() >= agirlik)
			{
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());
			}
		}
	}
	
	public static void agirlikFiltrele2(int agirlik,Elma [] elmalar)
	{
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if(elma.getAgirlik() < agirlik)
			{
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());
			}
			
		}
	}
	
	public static void filtrele(IElmaFiltresi elmaFiltresi, Elma [] elmalar)
	{
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if(elmaFiltresi.filtrele(elma))
			{
				System.out.println(elma.getAgirlik() + " " + elma.getRenk());
			}
			
		}
	}
	

	
}
