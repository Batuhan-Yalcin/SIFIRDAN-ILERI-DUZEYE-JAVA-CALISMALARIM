package CalisanYonetimSistemiOOP;

public class Main {

	public static void main(String[] args) {
		Yazilimci yazilimci = new Yazilimci("Batuhan","IT Depertmanı", 23750);
		SatisTemsilcisi satis = new SatisTemsilcisi("Ahmet", "Saha Elemanı", 15000);
		Yönetici yonetici = new Yönetici("Şevval", "HomeOffice", 70000);
		
	
		

		yazilimci.bilgileriGoster();
		yazilimci.calisma();
		yazilimci.performansDeğerlendir();
		yazilimci.zamYap(5000);
		System.out.println("-----------------------------------------------------------------------");
		satis.bilgileriGoster();
		satis.calisma();
		satis.performansDeğerlendir();
		satis.zamYap(2000);
		System.out.println("-----------------------------------------------------------------------");
		
		yonetici.bilgileriGoster();
		yonetici.calisma();
		yonetici.performansDeğerlendir();
		yonetici.zamYap(1000);
		
		

	}

}
