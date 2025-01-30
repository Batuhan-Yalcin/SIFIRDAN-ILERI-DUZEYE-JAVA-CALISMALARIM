package HayvanlarOOP;

public class Main {

	public static void main(String[] args) {
		
		Kedi kedi = new Kedi("Minnoş", "British", 1);
		Kopek kopek = new Kopek("Ceki", "Shitzhu", 5);
		
		kedi.hayvanBilgileriGoster();
		kedi.sesCikar();
		
		System.out.println("--------------------");
		
		kopek.hayvanBilgileriGoster();
		kopek.sesCikar();

	}

}
