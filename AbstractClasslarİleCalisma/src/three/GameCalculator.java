package three;

public abstract class GameCalculator {

	public abstract void hesapla(); // Herkesin Farklı kullanmak zorunda olduğu abstract method.
	
	
	public final void gameOver() // Herkesin Ortak Kullanmak zorunda olduğu method
	{
		System.out.println("Oyun Bitti..");
	}
		
	
	
}
