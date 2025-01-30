
public class CokBoyutluDizilerleCalismak {

	public static void main(String[] args) {
		
		
		
		
		// TÜRKİYE DE Kİ BÖLGELERİ VE O BÖLGELERDE Kİ ŞEHİRLERİ İÇEREN ÇOK BOYUTLU DİZİYİ YAPALIM..
		
		
		String [] [] sehirler = new String [3] [3]; // 3 BÖLGEDEN 3 ŞEHİRDEN OLUŞAN BİR DİZİ OLUŞTURDUK.
		
		sehirler [0] [0] = "İstanbul"; // SEHİRLER DİZİSİNİN 0. SATIRININ 0. SÜTUNU İSTANBUL 
		sehirler [0] [1] = "Ankara";
		sehirler [0] [2] = "Adana";
		sehirler [1] [0] = "Sivas";
		sehirler [1] [1] = "İzmir";
		sehirler [1] [2] = "Antalya";
		sehirler [2] [0] = "Burdur";
		sehirler [2] [1] = "Kars";
		sehirler [2] [2] = "Bursa";
		
		for (int i = 0; i<=2; i++)
		{
			System.out.println("--------------");
			for (int j =0; j<=2; j++)
			{
			System.out.println(sehirler [i][j]);
			
			}
		}
			
			
	}

}
