public class AccountSummary implements Reportable {
    private BankAccount account;

    public AccountSummary(BankAccount account) {
        this.account = account;
    }

    @Override
    public String generateReport() {
        return "Account Summary:\n" +
                "Account Number: " + account.getAccountNumber() + "\n" +
                "Account Holder: " + account.getAccountHolderName() + "\n" +
                "Balance: " + account.getBalance();
    }
}
