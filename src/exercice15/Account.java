package exercice15;

public class Account {
	private int id;
	private Customer customer;
	private double balance;

	public Account (int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Account (int id, Customer customer) {
		this.id = id;
		this.customer = customer;
		balance = 0.0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String toString() {
		return customer + " " +balance + "$";
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public double deposit(double amount) {
		balance += amount;
		return balance;
	}

	public double withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			
		}
		else {
			System.out.println("Amount withdrawn exceeds the current balance !");
		}
		return balance;
	}

}

