package first;

public class Main {

	public static void main(String[] args) {
		
		CiftciKredisi ciftci = new CiftciKredisi();
		AskerKredisi asker = new AskerKredisi();
		EgitimKredisi egitim = new EgitimKredisi();
		
		ciftci.KrediCikiyorMu();
		ciftci.TopluKrediHesapla(150000);
		
		asker.KrediCikiyorMu();
		asker.TopluKrediHesapla(225000);
		
		egitim.KrediCikiyorMu();
		egitim.TopluKrediHesapla(780000);

	}

}
