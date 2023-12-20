package week2;

public class BankAcc {

	int Acc_num;
	int Balance;
	String Name;
	
	// Parameterized structure
	public BankAcc(int acc_num, int balance, String name) {
		super();
		Acc_num = acc_num;
		Balance = balance;
		Name = name;
	}
	
	
	//Display
	public void Display() {
		System.out.println("The Account number "+Acc_num+" belonging to "+Name);
		System.out.println("Has an account balance of "+Balance+" AED");
	}

	//Withdraw
	public void Withdraw(int amount) {
		Balance=Balance-amount;
		System.out.println("\n The amount "+amount+" AED has been withdrawn."); //  \n means new line
		
	}
	
	//Deposit
	public void Deposit(int amount) {
		Balance=Balance+amount;
		System.out.println("\n The amount "+amount+" AED has been Deposited."); //  \n means new line
		
	}
	
	
	
	//setters and getters
	public int getAcc_num() {
		return Acc_num;
	}
	public void setAcc_num(int acc_num) {
		Acc_num = acc_num;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
