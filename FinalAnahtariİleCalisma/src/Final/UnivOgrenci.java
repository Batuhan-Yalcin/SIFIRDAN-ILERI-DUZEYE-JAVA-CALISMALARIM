package Final;

public class UnivOgrenci extends Ogrenci {
	
	public UnivOgrenci (int n)
	{
		super(n);
	}
	
	public void yazdir()

	{
		System.out.println("Univ Öğrencesi : " + getNumara());
	}
}
