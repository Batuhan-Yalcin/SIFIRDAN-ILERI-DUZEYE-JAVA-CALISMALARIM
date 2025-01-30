package three;

public class AgirlikFiltresi implements IElmaFiltresi{
	
	@Override
	public boolean filtrele(Elma elma)
	{
		return elma.getAgirlik() >=80;
	}

}
