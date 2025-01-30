package AraclarveSuruculerSistemiOOP;

public class EgitimliSurucu extends Surucu {


    public EgitimliSurucu(Arac arac) {
        super(arac);
    }

    @Override
    public void surusYap() {
        System.out.println("Eğitimli Sürücü araçla sürüş yapıyor.");
        arac.hareketEt();
    }

}
