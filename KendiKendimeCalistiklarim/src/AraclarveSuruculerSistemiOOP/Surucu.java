package AraclarveSuruculerSistemiOOP;

public abstract class Surucu {

	   protected Arac arac;

	    public Surucu(Arac arac) {
	        this.arac = arac;
	    }
	    public abstract void surusYap();
}
