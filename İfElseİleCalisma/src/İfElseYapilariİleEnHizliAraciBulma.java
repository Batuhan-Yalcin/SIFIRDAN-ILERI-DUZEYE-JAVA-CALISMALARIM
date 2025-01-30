
public class İfElseYapilariİleEnHizliAraciBulma {

	public static void main(String[] args) {
		
		
		int bmwHizi = 300;
		int audiHizi = 290;
		int mercedesHizi = 280;
		
		int enHizli = audiHizi; // en hizli araç duruma göre değişecektir..
		
		 if (enHizli < bmwHizi) 
			 enHizli = bmwHizi;
		 
		 if(enHizli < audiHizi) 
			 enHizli = audiHizi;
		 
		 if(enHizli <mercedesHizi) 
			 enHizli = mercedesHizi;
		
		 System.out.println("En Hızlı Aracın Hızı  : " + enHizli);
	}

}
