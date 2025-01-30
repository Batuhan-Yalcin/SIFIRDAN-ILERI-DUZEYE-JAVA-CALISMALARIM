
public class Main {

	public static void main(String[] args) {
	
		
		 Barınak barinak = new Barınak();

	        Hayvan kedi1 = new Kedi( "Minnoş",2,"Sağlıklı",2025);
	        Hayvan kedi2 = new Kedi( "Armut",3,"Sağlıksız",2023);
	        Hayvan kedi3 = new Kedi( "Tekir",5,"Tedavi Gerekli",2020);
	        Hayvan kedi4 = new Kedi( "Ayşo",7,"Ölmek Üzere",2021);
	        
	        Hayvan kopek1 = new Köpek("Karabaş", 3, "Tedavi Gerekli", 2022);

	        barinak.HayvanEkle(kedi1);
	        barinak.HayvanEkle(kedi2);
	        barinak.HayvanEkle(kedi3);
	        barinak.HayvanEkle(kedi4);
	        barinak.HayvanEkle(kopek1);

	        
	        Personel personel1 = new Personel("Ahmet", "Veteriner", 35);
	        Personel personel2 = new Personel("Ayşe", "Bakıcı", 28);

	        barinak.PersonelEkle(personel1);
	        barinak.PersonelEkle(personel2);

	        
	        barinak.HayvanlariListele();
	        barinak.PersonelleriListele();
	    

	}

}
