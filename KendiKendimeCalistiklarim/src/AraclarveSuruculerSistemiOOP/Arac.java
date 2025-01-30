package AraclarveSuruculerSistemiOOP;

public abstract class Arac implements Hizlanabilir, FrenYapabilir {
	
	  protected String marka;
	    protected String model;
	    protected int hiz;

	    public Arac(String marka, String model, int hiz) {
	        this.marka = marka;
	        this.model = model;
	        this.hiz = hiz;
	    }

	    public abstract void hareketEt();
	    public abstract void dur();
	    
	    public int getHiz() {
	        return hiz;
	    }

	    public void setHiz(int hiz) {
	        this.hiz = hiz;
	    }

}
