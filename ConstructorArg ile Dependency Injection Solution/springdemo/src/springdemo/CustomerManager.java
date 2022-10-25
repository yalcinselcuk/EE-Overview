package springdemo;

public class CustomerManager implements ICustomerManager{
	
	private ICustomerDal customerdal;
	
	public CustomerManager(ICustomerDal customerdal) {
		super();
		this.customerdal = customerdal;
	}
	@Override
	public void add() {
		//is kurallari 
		//eger ki kurallar saglaniyorsa CustomerDal / add() cagrilir
		customerdal.add();
	}
}
