package StringVeriTipiAlanArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
	
		
		ArrayList<String>  sehirler = new ArrayList<String>();
		
		sehirler.add("İSTANBUL");
		sehirler.add("ANKARA");
		sehirler.add("SİVAS");
		sehirler.add("KAYSERİ");
		sehirler.add("MALATYA");
		
		sehirler.remove("İSTANBUL"); // LİSTEDEN İSTANBULU SİL
		Collections.sort(sehirler); // ŞEHİRLER İ ALFABETİK BİR ŞEKİLDE SIRALAR..
		
		for (String sehir : sehirler)
		{
			System.out.println(sehir);
		}
		
	}

}
