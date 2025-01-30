package two;

public class OutsourceWorker implements IWorkable, IEatable {

	@Override
	public void work() {
		System.out.println("Dış Çalışan Çalışmaya Başladı..");
		
	}
	
	@Override
	public void eat() {
		System.out.println("Dış Çalışan Yemek yemeye başladı..");
		
	}
}
