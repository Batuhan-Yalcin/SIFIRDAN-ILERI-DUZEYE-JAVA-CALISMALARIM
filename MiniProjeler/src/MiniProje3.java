
public class MiniProje3 {

	public static void main(String[] args) {
	
		
		
		// MÜKEMMEL TAM SAYIYI BULAN PROGRAM..
		// 	MÜKEMMEL SAYI NEDİR ? 
		// MÜKEMMEL SAYI KENDİ DIŞINDA Kİ BÖLENLERİNİN TOPLAMI O SAYI İSE ONA MÜKEMMEL SAYI DENİR.
		
		// 6 --> 1,2,3 e Bölünür 1-2-3 ü topladığımızda 6 eder..
		// 28 --> 1,2,4,7,14 e Bölünür. 1 + 2 + 4 + 7 + 14 = 28 eder. 
		
		int sayi = 6;
		int toplam = 0;
		
		for(int i = 1; i<sayi; i++)
		{
			if(sayi % i ==0)
			{
			toplam +=i;
			}
		}
		
		if(toplam == sayi)
		{
			System.out.println("Mükemmel Sayıdır.");
		}
		else {
			System.out.println("Mükemmel Sayı Değildir !");
		}

	}

}
