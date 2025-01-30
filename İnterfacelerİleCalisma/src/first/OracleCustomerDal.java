package first;

public class OracleCustomerDal implements ICustomerDal , IRepository{
	
	@Override
	public void add() {
		System.out.println("Oracle Eklendi.");
	}
	
	public	void update()
	{
		System.out.println("Veriler Güncelleniyor..");
	}

}
