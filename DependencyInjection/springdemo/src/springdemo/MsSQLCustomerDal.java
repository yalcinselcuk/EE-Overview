package springdemo;

public class MsSQLCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("MsSQL'e eklendi");
	}

}
