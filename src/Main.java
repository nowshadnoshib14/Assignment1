public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 100);

        try {
            account.deposit(50);
            System.out.println("Deposited $50. Current balance: $" + account.getBalance());

            account.withdraw(200);
            System.out.println("Withdrew $200. Current balance: $" + account.getBalance());

        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(50);
            System.out.println("Withdrew $50. Current balance: $" + account.getBalance());
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.deposit(-10);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Final balance: $" + account.getBalance());
    }
}