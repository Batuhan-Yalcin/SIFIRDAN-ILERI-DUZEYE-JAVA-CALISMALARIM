package first;

public class MySqlCustomerDal implements ICustomerDal , IRepository
{

	@Override
	public void add() {
		
		System.out.println("Mysql Eklendi");
	}
	@Override
	
	public	void update()
	{
		System.out.println("Veriler Güncelleniyor..");
	}
	
}
