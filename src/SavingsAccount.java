
public class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 100.0;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (getBalance() - amount < MINIMUM_BALANCE) {
            throw new Exception("Cannot withdraw below minimum balance!");
        }
        super.withdraw(amount);
    }
}
