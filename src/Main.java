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
        sc.close();

    }

}