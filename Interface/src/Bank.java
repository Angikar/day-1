
public class Bank {
	public static void main(String[] args) {
		IAccount[] accounts = new IAccount[3];
		accounts[0] = new FDAccount();
		accounts[1] = new SavingsAccount();
		accounts[2] = new RecurDeposit();
		for (IAccount iAccount : accounts) {
			iAccount.deposit();
		}
	}
}
