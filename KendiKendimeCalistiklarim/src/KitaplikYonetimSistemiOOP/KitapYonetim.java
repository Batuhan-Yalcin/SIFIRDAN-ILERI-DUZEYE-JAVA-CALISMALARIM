	package KitaplikYonetimSistemiOOP;
	
	import java.util.ArrayList;
	import java.util.Collections;	
	public  class KitapYonetim {

		  ArrayList<Kitap> kitaplar = new ArrayList<>();
	
		    public void kitapEkle(String kitapAdi, int fiyat, int yayinYili) {
		        Kitap yeniKitap = new Kitap(kitapAdi, fiyat, yayinYili);
		        kitaplar.add(yeniKitap);
		        System.out.println("Kitap Eklendi: " + kitapAdi);
		    }
	
		    public void kitapListele() {
		        for (Kitap kitap : kitaplar) {
		            System.out.println("Kitap Adı: " + kitap.kitapAdi + ", Fiyat: " + kitap.fiyat + ", Yayın Yılı: " + kitap.yayinYili);
		        }
		    }
	
		    public void kitapSil(String kitapAdi) {
		        kitaplar.removeIf(kitap -> kitap.kitapAdi.equals(kitapAdi));
		        System.out.println("Kitap Silindi: " + kitapAdi);
		    }
	
		    public void kitaplariFiyataGoreSirala() {
		        Collections.sort(kitaplar, (k1, k2) -> Integer.compare(k1.fiyat, k2.fiyat));
		        System.out.println("Kitaplar Fiyatına Göre Sıralandı:");
		        kitapListele();
		    }
		}