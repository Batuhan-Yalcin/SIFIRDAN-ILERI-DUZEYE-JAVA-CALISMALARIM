package Kısım8;

import java.util.Scanner;

public class Main {

	
public static void main(String[] args) {
	
	
	// BAKİYE GÖRÜNTÜLEME 
	// PARA YATIRMA 
	// PARA ÇEKME 
	
	Scanner scann = new Scanner(System.in);
	double bakiye = 1000.0;
	
	while(true)
	{
		System.out.println("Bir İşlem seçiniz : ");
		System.out.println("1 - Para Yatır");
		System.out.println("2 - Para Çekme");
		System.out.println("3 - Para görüntüleme");
		System.out.println("Lütfen bir işlem seçiniz : ");
		int secim = scann.nextInt();
		if(secim == 1)
		{
			System.out.println("Yatırmak istediğiniz miktarı giriniz : ");
			double yatirilanMiktar = scann.nextDouble(); // kullanıcın yatırdığı miktarı temsil ediyor
			bakiye = paraYatir(bakiye, yatirilanMiktar);
			System.out.println("Para yatırıldı, Güncel bakiyeniz : " + bakiye);
		}
		else if (secim == 2)
		{
			System.out.println("Çekmek istediğiniz miktarı giriniz : ");
			double cekilenMiktar = scann.nextDouble();
			bakiye = paraCek(bakiye, cekilenMiktar);
			System.out.println("Paranız çekildi, Güncel bakiyeniz : " + bakiye);
		}
		else if (secim == 3)
		{
			System.out.println(bakiyeGoruntule(bakiye));
		}
		else if (secim == 4)
		{
			System.out.println("Çıkış yapılıyor..");
			scann.close();
			break;
		}
		else {
				System.out.println("Geçersiz tuşlama yaptınız..");
		}
	}
	
		
		
		
		
	}
	
	public static double paraYatir(double mevcutBakiye,double yatirilanMiktar)
	{
		if(yatirilanMiktar > 0)
		{
			mevcutBakiye += yatirilanMiktar;
		}
		else {
			System.out.println("Yatırılan miktarı düzgün giriniz..");
		}
		return mevcutBakiye;
	}
	
	public static double paraCek(double mevcutBakiye, double cekilenMiktar)
	{
		if(cekilenMiktar >0 && cekilenMiktar <= mevcutBakiye)
		{
			mevcutBakiye -= cekilenMiktar;
		}
		else {
			System.out.println("Bakiyenizden Fazla para çekemezsiniz..");
		}
		return mevcutBakiye;
	}
	
	public static double bakiyeGoruntule(double mevcutBakiye)
	{
		return mevcutBakiye;
	}
	
}