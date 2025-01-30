package Örnekler;

public class Main {

	public static void main(String[] args) {
		
		AracUI aracUI = new AracUI();
		
		aracUI.AracSesleri(new ArabaEgzoz());
		aracUI.AracSesleri(new ArabaMotor() );

	}

}
