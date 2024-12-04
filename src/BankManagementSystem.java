import java.util.Scanner;


public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transactions");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Account Number: ");
                        String accNumber = scanner.next();
                        System.out.print("Enter Account Holder Name: ");
                        String holderName = scanner.next();
                        System.out.print("Enter Initial Balance: ");
                        double balance = scanner.nextDouble();
                        account = new BankAccount(accNumber, holderName, balance);
                        System.out.println("Account created successfully!");
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = scanner.nextDouble();
                        account.deposit(deposit);
                        System.out.println("Deposit successful!");
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = scanner.nextDouble();
                        account.withdraw(withdraw);
                        System.out.println("Withdrawal successful!");
                        break;

                    case 4:
                        System.out.println("Balance: " + account.getBalance());
                        break;

                    case 5:
                        System.out.println("Transaction History:");
                        for (String transaction : account.getTransactionHistory()) {
                            System.out.println(transaction);
                        }
                        break;

                    case 6:
                        System.out.println("Exiting. Thank you!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
