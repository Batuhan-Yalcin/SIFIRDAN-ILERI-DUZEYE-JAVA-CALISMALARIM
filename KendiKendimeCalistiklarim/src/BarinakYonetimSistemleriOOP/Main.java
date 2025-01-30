package BarinakYonetimSistemleriOOP;

public class Main {

    public static void main(String[] args) {

        
        Aslan aslan = new Aslan("Necati", "Yırtıcı", 5, 32.30);
        Balık balik = new Balık();
        balik.balıkBilgileri();

        Kus kus = new Kus();
        kus.kusBilgileri(kus);

       
        ZooManager zooManager = new ZooManager();
        zooManager.hayvanEkle(aslan);
        zooManager.hayvanEkle(balik);
        zooManager.hayvanEkle(kus);

       
        zooManager.hayvanOzellikleri();

     
        aslan.sesCikarmak();
        aslan.yemekYemek();

        balik.sesCikarmak();
        balik.yemekYemek();
        balik.yuzmeYap(); 

        kus.sesCikarmak();
        kus.yemekYemek();
        kus.ucusYap(); 
    }
}
