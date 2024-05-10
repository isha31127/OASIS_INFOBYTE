import java.util.*;
class BankAccount{
    private String acc_no;
    private int pin,balance;
    BankAccount(String acc_no){
        this.acc_no=acc_no;
    }
    BankAccount(String acc_no,int pin,int balance){
        this.acc_no=acc_no;
        this.pin=pin;
        this.balance=balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount+" rs ");

    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount+" rs");
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public void transfer(BankAccount recipient, double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Transferred: " + amount+" rs "+" to "+recipient.acc_no);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n************************************************************WELCOME*******************************************************");
        System.out.println("\nPlease enter you account number : ");
        String acc_no= sc.next();
        System.out.println("\nPlease enter your pin :");
        int pin = sc.nextInt();
        BankAccount b1 = new BankAccount(acc_no,pin,2000);
        System.out.println("\nlogin successfully");
        System.out.println("\n_____________________________________________________________________________________________________________________________");
        int choice;
        do{
            System.out.println("\nATM Menu:");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n________________________TRANSACTION HISTORY____________________________");
                    System.out.println("\nAccount number : "+acc_no);
                    System.out.println("\nAvailabel balance  : "+b1.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw in rupess :  ");
                    double withdrawAmount = sc.nextDouble();
                    b1.withdraw(withdrawAmount);
                    System.out.println("\nAvailable balance  : "+b1.getBalance());
                    break;
                case 3:
                    System.out.print("Enter amount to deposit in rupees: ");
                    double depositAmount = sc.nextDouble();
                    b1.deposit(depositAmount);
                    System.out.println("\nAvailable balance  : "+b1.getBalance());
                    break;
                case 4:
                    System.out.println("\nenter account number of receipt : ");
                    String acc_num=sc.next();
                    BankAccount b2 = new BankAccount(acc_num);
                    System.out.println("\nenter total amount to transfer : ");
                    int amount = sc.nextInt();
                    b1.transfer(b2, amount);
                    System.out.println("\nAvailable balance  : "+b1.getBalance());
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(choice!=-1);
    }
}
