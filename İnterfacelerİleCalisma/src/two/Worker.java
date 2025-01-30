package two;
// Bizim çalışanımız..
public class Worker implements IWorkable , IEatable,IPayable {

	@Override
	public void pay() {
		System.out.println("Şirket Çalışanına maaş ödendi..");
		
	}

	@Override
	public void eat() {
		System.out.println("Şirket Çalışanı Yemek yiyor..");
		
	}

	@Override
	public void work() {
		System.out.println("Şirket Çalışanı Çalışıyor.");
		
	}
	




}
