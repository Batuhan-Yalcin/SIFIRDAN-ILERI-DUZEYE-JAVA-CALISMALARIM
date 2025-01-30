package Thread;

public class Main {

	public static void main(String[] args) {
		
		KronometreThread thread1 = new KronometreThread("Kronometre 1");
		
		KronometreThread thread2 = new KronometreThread("Kronometre 2");
		
		KronometreThread thread3 = new KronometreThread("Kronometre 3");
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
