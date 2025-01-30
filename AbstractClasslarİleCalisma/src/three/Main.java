package three;

public class Main {

	public static void main(String[] args) {
		
		GameCalculator man = new ManGameCalculator();
		GameCalculator woman = new WomanGameCalculator();
		GameCalculator kid = new KidsGameCalculator();
		GameCalculator old = new OlderGameCalculator();
		
		man.hesapla();
		man.gameOver();
		
		woman.hesapla();
		woman.gameOver();
		
		kid.hesapla();
		kid.gameOver();
		
		old.hesapla();
		old.gameOver();

	}

}
