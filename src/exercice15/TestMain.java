package exercice15;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test de la classe Customer
		Customer c1 = new Customer(1, "Gerard Menvueca", 'm');
		System.out.println(c1);
		
		System.out.println("The id is : " + c1.getId());
		System.out.println("The name is :" + c1.getName());
		System.out.println("The gender is :" + c1.getGender());
		
		//Test de la classe Account
		Account a1 = new Account(1, c1, 1000);
		System.out.println(a1);
		Account a2 = new Account(1, new Customer(2, "Eve Elevetoi", 'f'), 2500);
		System.out.println(a2);
		
		System.out.println("The id is : " + a1.getId());
		System.out.println("The customer is ;" + a1.getCustomer());
		System.out.println("The balance is :" + a1.getBalance());
		System.out.println("The name of the customer is : " + a1.getCustomerName());
		
		System.out.println("The id is : " + a2.getId());
		System.out.println("The customer is ;" + a2.getCustomer());
		System.out.println("The balance is :" + a2.getBalance());
		System.out.println("The name of the customer is : " + a2.getCustomerName());
		
		a1.deposit(100);
		System.out.println("The new balance is : " + a1.getBalance());
		
		a2.withdraw(2700);
		a2.withdraw(2400);
		System.out.println("The new balance is : " + a2.getBalance());
			
		}
	}


