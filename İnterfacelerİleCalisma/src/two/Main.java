package two;

public class Main {

	public static void main(String[] args) {
		
		
		IWorkable iWorkable = new Worker();
		iWorkable.work();
		IEatable eatable = new Worker();
		eatable.eat();
		IPayable pay = new Worker();
		pay.pay();
		
		
		IWorkable sourceWorker = new OutsourceWorker();
		sourceWorker.work();
		
		IEatable eat = new OutsourceWorker();
		eat.eat();	// Dış çalışanın maaşı farklı yerden ödendiği için maaş ödemesi yapılmayacaktır.
		
		IWorkable robotWork = new Robot();
		robotWork.work();
		
		
		
		
		
		

	}

}
