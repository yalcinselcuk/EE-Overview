package springdemo;

public class CustomerManager {
	
	private ICustomerDal customerdal;
	
	public CustomerManager(ICustomerDal customerdal) {
		super();
		this.customerdal = customerdal;
	}

	public void add() {
		//is kurallari 
		//eger ki kurallar saglaniyorsa CustomerDal / add() cagrilir
		customerdal.add();
	}
}
