package OgrenciDersNotlarıOOP;

import java.util.ArrayList;

public class Ogrenci {

	ArrayList<String> derslerListesi = new ArrayList<String>();
	
	public Ogrenci(String ad,String soyad)
	{
		this.ad = ad;
		this.soyad =soyad;
	}
	
	String ad;
	String soyad;
	
	
	public void dersEkle(String ... ders)
	{
		for(String dersler : ders)
		{
			derslerListesi.add(dersler);
			System.out.println(ad +" " + soyad + " " + "Adlı Öğrenciye" + " " + dersler +" "+ "Dersi"+ " "+ "Eklendi");
			
		}
	}
	
	public void dersleriGoster()
	{
		for(String dersler : derslerListesi)
		{
			System.out.println("Dersleriniz : " + dersler);
		}
	}
	
	public void ogrenciBilgileriGoster()
	{
		System.out.println("Öğrencinin Adı : " + ad + " " + "Soyadı : " + " " + soyad);
	}
	

	
}
