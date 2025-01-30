package AraclarveSuruculerSistemiOOP;

public class Motosiklet extends Arac implements Hizlanabilir ,FrenYapabilir {

    public Motosiklet(String marka, String model, int hiz) {
        super(marka, model, hiz);
    }

    @Override
    public void hareketEt() {
        System.out.println(marka + " " + model + " hareket ediyor.");
    }

    @Override
    public void dur() {
        System.out.println(marka + " " + model + " durdu.");
    }

    @Override
    public void hizlanabilir(int hizArtisi) {
        hiz += hizArtisi;
        System.out.println(marka + " hızlandı. Yeni hız: " + hiz + " km/s");
    }

    @Override
    public void frenYap(int hizAzaltilacak) {
        hiz -= hizAzaltilacak;
        if (hiz < 0) hiz = 0;
        System.out.println(marka + " freni yaptı. Yeni hız: " + hiz + " km/s");
    }

	


}
