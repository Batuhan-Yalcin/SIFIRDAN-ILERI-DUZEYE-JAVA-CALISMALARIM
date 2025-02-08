package Super;

public class Main {

	public static void main(String[] args) {
		KisiBaseClass kisi = new KisiBaseClass("Batuhan");
		System.out.println(kisi.getIsim());
		
		Ogrenci ogrenci = new Ogrenci("Şevval", 58);
		
		System.out.println( ogrenci.getIsim() + " " +  ogrenci.getNumara() );
		
		ogrenci.ozet();
		
	}

}
