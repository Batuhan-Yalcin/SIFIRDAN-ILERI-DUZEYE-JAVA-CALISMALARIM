package ThrowOrnek;

public class Main {
	public static void main(String [] args ) {
		
		int a =10;
		int b =0;
		try {
			System.out.println(a/b);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		finally {
			System.out.println("Program Bu satıra Finally sayesinde ulaştı.");
		}
		
	}

}
