package two;

public class Main {

	public static void main(String[] args) {
		
		// Not : Abstract Classlar Doğrudan Nesne Oluşturamaz Ancak Alttaki şekilde bir Nesne Oluşturulabilir..
		
		AFiyatlar Hyundai = new HyundaiFiyat();
		AFiyatlar Bmw = new BmwFiyat();
		AFiyatlar Toyota = new ToyotaFiyat();
		
		Hyundai.aracMarkası("Hyundai Elantra");
		Hyundai.AracFiyatHesapla();
		System.out.println("--->--->--->--->--->--->--->--->--->--->--->--->--->--->--->");
		
		Bmw.aracMarkası("BMW 5.25");
		Bmw.AracFiyatHesapla();
		System.out.println("--->--->--->--->--->--->--->--->--->--->--->--->--->--->--->");
		
		Toyota.aracMarkası("Toyota Corolla");
		Toyota.AracFiyatHesapla();
	}

}
