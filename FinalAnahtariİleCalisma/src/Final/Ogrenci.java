package Final;

public /*final*/ class Ogrenci { // Final olarak class yaparsak o classı hiç kimse miras alamaz..

	// Final anahtar kelimesi değiştirilemez..
	private final int numara;
	
	public Ogrenci(int n)
	{
		numara = n;
	}
	
	public int getNumara()
	{
		return numara;
	}
	
	public /*final*/ void yazdir() // Final olarak method yazarsak Bu method başka classta kullanılamaz.
	{
		System.out.println("Öğrenci Numarası : " + numara);
	}

}
