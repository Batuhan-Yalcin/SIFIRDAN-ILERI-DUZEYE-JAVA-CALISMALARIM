package BarinakYonetimSistemleriOOP;

public class Balık extends Hayvan implements IYuzebilenHayvan {

    @Override
    public void yuzmeYap() {
        System.out.println("Balık suda yüzüyor...");
    }

    @Override
    public void yemekYemek() {
        System.out.println("Balık yem yiyor...");
    }

    @Override
    public void sesCikarmak() {
        System.out.println("Balık sessiz bir şekilde yüzüyor...");
    }

    public void balıkBilgileri() {
        this.ad = "Esmer";
        this.tur = "Japon";
        this.yas = 4;
        this.agirlik = 0.50;
    }
}
