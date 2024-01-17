public class CreateBankAccount {
    private String holder;
    private final int accountNumber;
    private double balance;

    public CreateBankAccount(String holder, int accountNumber){
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public CreateBankAccount(String holder, int accountNumber, double balance){
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = balance;
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

    public double deposit(double balance){
        return this.balance += balance;
    }

    public double withdraw(double balance){
        return this.balance -= balance;
    }

    public void printDataOnAccount(){
        System.out.printf("Account data:\nAccount: %d\nHolder: %s\nBalance: %.2f\n",this.accountNumber,this.holder,this.balance);
    }

}
