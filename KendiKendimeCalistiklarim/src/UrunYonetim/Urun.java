package UrunYonetim;

import java.util.ArrayList;

public class Urun {


	ArrayList<String> urunler = new ArrayList<String>();
	
	public void urunEkle(String urunEkleme)
	{
		urunler.add(urunEkleme);
		System.out.println("Ürün Eklendi : " + urunEkleme);
	}
	
	public void urunListele()
	{
		for(String urun : urunler)
		{
			System.out.println("Mevcut Ürünler : " + urun);
		}
	}
	
	public void urunSil(String urunler2)
	{
		
		urunler.remove(urunler2);
		System.out.println("Ürün Silindi : " + urunler2);
			
	}

	}

