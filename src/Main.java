import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static ArrayList<AccountBank> accountBanks = new ArrayList<>();

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to EBank!");
        System.out.println("Please enter your account number:");
        String accountNumber = scanner.nextLine();
        System.out.println("Please enter your account holder name");
        String accountHolderName = scanner.nextLine();
        System.out.println("Please enter your account balance");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        AccountBank accountBank = new AccountBank();
        accountBank.setBalance(balance);
        accountBank.setAccountNumber(accountNumber);
        accountBank.setAccountHolderName(accountHolderName);
        System.out.println("Your account balance is:" + accountBank.getBalance());
        // test deposit
        System.out.println("Test deposit method.");
        System.out.println("---------------------");
        System.out.println("Please enter deposit amount.");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Deposit amount is" + depositAmount );
        accountBank.deposit(depositAmount);
        System.out.println("Your account balance after deposit is:"+ accountBank.getBalance());
        // test withdraw
        System.out.println("----------------------");
        System.out.println("Test withdraw method.");
        System.out.println("-----------------------");
        System.out.println("Please enter withdraw amount");
        double withdrawAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Withdraw amount is:" +withdrawAmount);
        accountBank.withdraw(withdrawAmount);
        System.out.println("Your account balance after withdraw is " +accountBank.getBalance());
        System.out.println("------------------------");
        // test transfer
        System.out.println("Test transfer method");
        System.out.println("----------------------");
        AccountBank destinationAccountBank = new AccountBank();
        destinationAccountBank.setAccountNumber("013");
        destinationAccountBank.setAccountHolderName("Hong Luyen");
        destinationAccountBank.setBalance(10000);
        accountBanks.add(destinationAccountBank);
        accountBanks.add(accountBank);
        destinationAccountBank.displayAccountInfo();
        accountBank.transfer("013", 5000);
        System.out.println("After transfer method.");
        System.out.println("My account");
        accountBank.displayAccountInfo();
        System.out.println("Destination account");
        destinationAccountBank.displayAccountInfo();

    }
}