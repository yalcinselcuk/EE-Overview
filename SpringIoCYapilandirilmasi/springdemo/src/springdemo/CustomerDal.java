package springdemo;

public class CustomerDal implements ICustomerDal{

	// veriye erisim buradan yapilir
	@Override
	public void add() {
		System.out.println("Oracle Veritabanına Eklendi");
	}

}
