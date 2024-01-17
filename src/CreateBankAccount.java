public class CreateBankAccount {
    private String holder;
    private int accountNumber;
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
}
