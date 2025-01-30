
public class DiziKullanimiDigerYontem {

	public static void main(String[] args) {
		
		
		// Şimdi burada yapacağımız işlem 2. dizi kullanma yöntemidir.
		
		
		
		double [] myList = new double [5]; // 5  değer alabilen bir dizi oluşturdum..
		double deger =0;
		double maxDeger = myList[0];
		
		myList [0] = 10.5; // dizinin 0. index değerinde 10.5 değeri olsun dedik
		myList [1] = 20.8; // dizinin 1. index değerinde 20.8 değeri olsun dedik gibi gibi..
		myList [2] = 30.10;
		myList [3] = 25.31;
		myList [4] = 22.01;
		
		
		
		// gelin birlikte yukarıda tanımladığımız sayıları foreach kullanarak ekrana yazdıralım..
		
		
		for (double number : myList)
		{
			System.out.println(number);
		}
		
		// Şimdi birlikte sayıların toplamını yazdıran döngüyü yazalım..
		// yukarıya double deger diye bir değişken tanımlayalım.
		
		for (double numberToplam : myList)
		{
			deger = deger+numberToplam;	
		}
		System.out.println("Sayıların toplamı : " +deger);
		
		
		
		// Hadi birde bu sayıların içinde ki en büyük sayıyı ekrana yazdıralım..
		// yukarıya doubleMaxDeger isminde bir degisken oluşturalım..
		
		for (double enYuksek : myList) 
		{
			if(maxDeger < enYuksek)
			{
				maxDeger = enYuksek;
			}
		}
		
		System.out.println("En büyük Sayı : " + maxDeger);
		

	}
}
