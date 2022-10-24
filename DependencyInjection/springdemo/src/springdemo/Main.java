package springdemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CustomerManager customermanager = new CustomerManager(new MsSQLCustomerDal());
		customermanager.add();
	}
	

}
