
public class Dortİslem {

	// Aynı methodu farklı parametreler ile istediğimiz kadar kullanabiliriz
	// mesela altta int sayi1, int sayi2 olarak parametre almış topla methodumuz var
	// onun altında ise int sayi1, int sayi2, int sayi3 olarak parametre almış topla methodumuz var
	// İşte buna Overloading Denir..
	
	
	public int topla(int sayi1,int sayi2)
	{
		return sayi1 + sayi2;
	}
	
	public int topla(int sayi1,int sayi2, int sayi3)
	{
		return sayi1 + sayi2+sayi3;
	}

}
