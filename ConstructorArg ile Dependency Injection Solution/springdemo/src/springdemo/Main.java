package springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//xml'i okumak icin = ClassPathXmlApplicationContext kullanilir
		//dosya yolu verilir bu nesneye
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICustomerManager customermanager = context.getBean("service",ICustomerManager.class);
		customermanager.add();
		
	}
	
}
