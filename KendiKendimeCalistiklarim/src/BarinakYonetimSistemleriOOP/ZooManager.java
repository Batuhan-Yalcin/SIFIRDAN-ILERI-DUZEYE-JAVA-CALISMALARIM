package BarinakYonetimSistemleriOOP;

import java.util.ArrayList;



public class ZooManager {
	
	ArrayList<Hayvan> hayvanYonetimi = new ArrayList<Hayvan>();
	
	public void hayvanEkle(Hayvan hayvan)
	{
		hayvanYonetimi.add(hayvan);
	}
	
	public void hayvanOzellikleri()
	{
		int index = 1;
		for(Hayvan hayvan : hayvanYonetimi)
		{
			   System.out.println(index + ".Hayvan :");
	            System.out.println("Hayvan adı : : " + hayvan.ad);
	            System.out.println("Hayvan Türü : " + hayvan.tur);
	            System.out.println("Hayvan Yaşı : " + hayvan.yas);
	            System.out.println("Hayvan Ağırlığı : " + hayvan.agirlik);
	            System.out.println("--------------------");
	            index++;
		}
	}

}
