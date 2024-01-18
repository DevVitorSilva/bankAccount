public class CreateBankAccount {
    private String holder;
    private final int accountNumber;
    private double balance;

    public CreateBankAccount(String holder, int accountNumber){
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public CreateBankAccount(String holder, int accountNumber, double initialDeposit){
        this.holder = holder;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public String getHolder(){
        return this.holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double balance){
        this.balance += balance;
    }

    public void withdraw(double balance){
        this.balance -= balance + 5.0;
    }

    public void printDataOnAccount(){
        System.out.printf("Account data:\nAccount: %d\nHolder: %s\nBalance: %.2f\n",this.accountNumber,this.holder,this.balance);
    }

}
