package three;

public class RenkFiltresi implements IElmaFiltresi 
{

	@Override
	public boolean filtrele(Elma elma)
	{
		return elma.getRenk().equals("Kırmızı");
	}

}
