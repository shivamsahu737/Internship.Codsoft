import java.util.Scanner;

public class ATM {
    static int total = 100000;
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println();
    try (Scanner in = new Scanner(System.in)) {

    while(true){
        System.out.println("Choose any given service");
        System.out.println("Withdrawl (enter 1)");
        System.out.println("Deposit (enter 2)");
        System.out.println("Amount Check (enter 3)");
            int input = in.nextInt();

            int amt;
            if(input == 1){
                System.out.println("Enter amount to withdrawl.");
                amt = in.nextInt();
                withdrawl(amt);
            }
            else if( input == 2){
                System.out.println("Enter amount to deposit.");
                amt = in.nextInt();
                deposit(amt);
            }
            else if(input == 3){
                check();
            }
            System.out.println();
            System.out.println("Exit (enter 1)");
            System.out.println("Use again (enter 2)");
            int flag = in.nextInt();
            System.out.println();
            if(flag == 2)
            continue;
            else
            break;
        }
    }

    }
    static void check() {
        System.out.println("Your balance:" + total);
    }
    static void deposit(int amt) {
        total = total + amt;
        System.out.println();
        System.out.println("Deposit succesfull.");
        System.out.println("Your balance: " + total);
    }
    static void withdrawl(int amt) {
        if(amt > total){
            System.out.println();
            System.out.println("Sorry, you have not enough amount.");
            System.out.println("Try agian.");
            return;
        }
        total = total - amt;
        System.out.println("Withdrawl Succesfull.");
        System.out.println("Your balace: " + total);
        return;
    }
    
}
