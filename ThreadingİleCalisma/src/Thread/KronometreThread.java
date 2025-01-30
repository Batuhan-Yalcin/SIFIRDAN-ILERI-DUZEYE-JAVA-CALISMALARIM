package Thread;

public class KronometreThread implements Runnable {
	
	private Thread thread;
	private String threadName;
	
	public KronometreThread(String threadName)
	{
		this.threadName = threadName;
		System.out.println("oluşturuluyor : " + threadName);
	}
	
	public void run()
	{
		System.out.println("Çalıştırılıyor : "+ threadName);
		
		try {
		for(int i =1; i <= 10; i++)
		{
			System.out.println(threadName + " :" + i);
			Thread.sleep(1000); // yukarıdaki kodu yazacak 1 saniye bekleyecek yazacak 1sn bekleyecek..
		}
		} catch (InterruptedException e) {
			System.out.println("Thread Bozuldu : " + threadName);
		}
		System.out.println("Thread Bitti : " + threadName);
		
	} 
	
	public void start() {
	System.out.println("Thread nesnesi Oluşuyor.");
	if(thread == null)
	{
		thread = new Thread(this,threadName);
		thread.start();
	}
	}
	
}
