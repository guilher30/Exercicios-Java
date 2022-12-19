package entities;

public class Account {
	private static final double TAX = 5.00;
	private String name;
	private int number;
	private double balance;
	
	public Account() {
		super();
	}

	public Account( int number,String name, double initialDeposite) {
		super();
		this.name = name;
		this.number = number;
		deposit(initialDeposite);
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		
	}
	 public void withdraw(double amount) {
		 this.balance -= amount + TAX;
	 }
	

	public Account(int number,String name) {
		super();
		this.name = name;
		this.number = number;
	}
	
	

	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + balance;
	}

}
