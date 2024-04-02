public class SavingsAccount extends BankAccount {
        
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void Withdraw(double withdrawAmount) {
        if(GetBalance() - withdrawAmount >= 100){
            super.Withdraw(withdrawAmount);
        } else {
            System.out.println("Unable to withdraw - balance would be less than 100");
        }
        
    }
}

