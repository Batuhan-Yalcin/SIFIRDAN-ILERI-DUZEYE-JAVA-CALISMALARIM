package AraclarveSuruculerSistemiOOP;

public class EhliyetliSurucu extends Surucu {

	
	 public EhliyetliSurucu(Arac arac) {
	        super(arac);
	    }

	    @Override
	    public void surusYap() {
	        System.out.println("Ehliyetli Sürücü araçla sürüş yapıyor.");
	        arac.hareketEt();
	    }

}
