package Overriding;

public class Main {

	public static void main(String[] args) {
		
		
		
		 /* 
		  public final double hesapla(double tutar)
	{
		return tutar * 1.18; // 1.18 kredi faizi gibi düşünebilirsiniz.
	}
	eğer ki baseManager da ki methodu böyle yazsaydık yani final koysaydık öğrenciKrediManager Onu Override edemezdi.
	Olduğu gibi kullanmak zorunda kalırdı yani krediyi 1.18 den kullanmak zorunda kalırdı.. Override edilmesin istiyorsak 
	final kullanırız.. 
		  
		  */
		
		BaseKrediManager [] krediManagers = new BaseKrediManager [] 
		{new OgretmenKrediManager(), new TarımKrediManager(),new OgrenciKrediManager()};
		
		
		
		for (BaseKrediManager krediManager : krediManagers)
		{
			System.out.println(krediManager.hesapla(1000)); // Hem öğretmen hem tarım için hesaplanacak..
		}
	
	}

}
