package two;

public class Main {

	public static void main(String[] args) {
		
		DatabaseHelper.Connection.createConnection();
		DatabaseHelper.Crud.Delete();
		DatabaseHelper.Crud.Update(); 
		

	}

}
