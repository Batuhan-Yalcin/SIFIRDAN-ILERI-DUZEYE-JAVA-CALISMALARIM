package Overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	@Override
	public double hesapla(double tutar)
	{
		return tutar * 1.10; // Öğrenci faizi 1.10 olduğu için aynı methodu öğrenci için yazıp faizi 1.10 a çektik.
	}
	
}
