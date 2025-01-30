package AraclarveSuruculerSistemiOOP;

public class Main {

	public static void main(String[] args) {
		
		  
        Arac araba = new Araba("BMW", "5.25", 100);
        Arac kamyon = new Kamyon("Mercedes", "Cd.200", 80);
        Arac motosiklet = new Motosiklet("Kawasaki", "H2R", 150);

        
        Surucu ehliyetliSurucu = new EhliyetliSurucu(araba);
        Surucu egitimliSurucu = new EgitimliSurucu(kamyon);

      
        ehliyetliSurucu.surusYap();
        araba.hizlanabilir(30);
        araba.frenYap(50);
        araba.dur();

        
        egitimliSurucu.surusYap();
        kamyon.hizlanabilir(20);
        kamyon.frenYap(30);
        kamyon.dur();
	}

}
