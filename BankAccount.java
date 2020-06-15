class BankAccount {

	protected double balance; 

	public void printBalance() {
		System.out.println("Your account balance is $" + balance);
	}

}

class CheckingAccount extends BankAccount {

	//Overriding method to "print balance"
	/*This is useful when we want our child class method 
	to have the same name as a parent class method 
	but behave a bit differently in some way.*/

	public void printBalance() {
		System.out.println("Your checking account balance is $" + balance);
	}
}