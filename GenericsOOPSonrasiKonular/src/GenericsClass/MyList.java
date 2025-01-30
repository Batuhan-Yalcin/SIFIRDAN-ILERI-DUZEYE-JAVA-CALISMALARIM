package GenericsClass;

public class MyList <T>{
	
		public void add(T value)
		{
			MyList<String> sehirler = new MyList<String>();
			sehirler.add("Ankara");
			sehirler.add("");
		}
		public void remove(T value)
		{
			
		}

}
