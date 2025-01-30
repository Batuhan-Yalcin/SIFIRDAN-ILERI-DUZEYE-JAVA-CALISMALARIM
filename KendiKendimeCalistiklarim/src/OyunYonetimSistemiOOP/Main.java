package OyunYonetimSistemiOOP;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

     
        gameManager.oyunEkle("GTA IV", "Aksiyon", 700);
        gameManager.oyunEkle("Max Payne", "Savaş", 300);
        gameManager.oyunEkle("CS GO", "Savaş", 500);


        System.out.println("Oyun Listesi:");
        gameManager.oyunListele();

        gameManager.oyunSil("Max Payne");
        
        System.out.println("-----------------");
        gameManager.oyunlariFiyataGoreSirala();
    }
}
