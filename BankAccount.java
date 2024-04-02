public class BankAccount {
    private double balance = 0;

    //constructor requiring the balance the user provided when creating their bank account
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Will take the depositAmount and add it to the existing balance
     * @param depositAmount the amount that should be added to the existing balance
     */
    public void Deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    /**
     * Will take the withdrawAmount and subtract it from existing balance
     * @param withdrawAmount the amount that should be removed from the existing balance
     */
    public void Withdraw(double withdrawAmount) {
        balance = balance - withdrawAmount;
    }

    public double GetBalance() {
        return balance;
    }

}


