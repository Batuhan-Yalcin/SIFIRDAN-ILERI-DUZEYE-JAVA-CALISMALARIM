import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kısım9 {

	public static void main(String[] args) {
		
		
	    	
   
     
	ArrayList<String>  sehirler = new ArrayList<String>();
    	
    	sehirler.add("İSTANBUL"); 
    	sehirler.add("ANKARA"); // silindi
    	sehirler.add("SİVAS");
    	sehirler.add("KAYSERİ"); // silindi
    	sehirler.add("MALATYA");
    	sehirler.add("NİĞDE");
    	sehirler.add("BURSA");
    	sehirler.add("ADANA"); 
    	// samsun eklendi - geri silindi
    	
    
        // Şu yazacağım kodun çıktısı ne olur 
    	
    	sehirler.remove(1);
    	sehirler.remove(2);
    	sehirler.add(null);
    	sehirler.add("Samsun");
    	sehirler.remove(6);

    	System.out.println(sehirler);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        /*
        
        
        
 
    	
    	
    	
    	
    	
    	
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
       
        */
        
        
        
        
        
        
	}

}
