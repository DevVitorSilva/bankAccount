import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Is there an initial deposit (y/n)? ");
        char initialDeposit = sc.next().charAt(0);
        CreateBankAccount bankAccount = new CreateBankAccount(holder, accountNumber);
        if(initialDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double firstDeposit = sc.nextDouble();
            bankAccount.deposit(firstDeposit);
            bankAccount.printDataOnAccount();
        }else{
            bankAccount.printDataOnAccount();
        }
        System.out.print("Enter deposit value: ");
        double deposit = sc.nextDouble();
        bankAccount.deposit(deposit);
        bankAccount.printDataOnAccount();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bankAccount.withdraw(withdraw);
        bankAccount.printDataOnAccount();
        sc.close();
    }

}