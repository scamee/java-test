public class main{
    public static void main(String[] args){
        BankAccount myBankAccount = new BankAccount("山田","A12345",12345);

        myBankAccount.displayBalance();

        myBankAccount.deposit(50000);
        myBankAccount.displayBalance();

        myBankAccount.withdraw(50000);
        myBankAccount.displayBalance();

        myBankAccount.deposit(-100);
        myBankAccount.displayBalance();

        myBankAccount.withdraw(-50000);
        myBankAccount.displayBalance();

        myBankAccount.withdraw(50000);
        myBankAccount.displayBalance();

        myBankAccount.withdraw(50000);
        myBankAccount.displayBalance();

    }
}