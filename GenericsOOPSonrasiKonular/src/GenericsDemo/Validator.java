package GenericsDemo;

public class Validator {
	
	public <T extends IEntity> void  validate(T entity) {
		Validator validator = new Validator();
		Customer customer = new Customer();
		validator.validate(customer);
	}

}
