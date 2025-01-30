package Final;


public class Main {

	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci(1);	
		System.out.println(ogrenci.getNumara());
		
		UnivOgrenci ogrenci2 = new UnivOgrenci(2);
			System.out.println(ogrenci2.getNumara());
			
			ogrenci2.yazdir();
	}

}
