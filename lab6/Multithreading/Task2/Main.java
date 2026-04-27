import java.util.Scanner;

//Don't be use user define

//public class Main {
//    public static void main(String[] args) {
//
//        ATM atm = new ATM();
//
//        DepositThread t1 = new DepositThread(atm);
//        WithdrawThread t2 = new WithdrawThread(atm);
//
//        t1.start();   // deposit first
//
//        try {
//            t1.join(); // wait for deposit
//        } catch (Exception e) {}
//
//        t2.start();  // then withdraw
//    }
//}






public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();

        System.out.print("Enter deposit amount: ");
        int dep = sc.nextInt();

        System.out.print("Enter withdraw amount: ");
        int wd = sc.nextInt();

        DepositThread t1 = new DepositThread(atm, dep);
        WithdrawThread t2 = new WithdrawThread(atm, wd);

        t1.start();

        try {
            t1.join(); // deposit first
        } catch (Exception e) {}

        t2.start();
    }
}

//output

//Enter deposit amount: 100
//Enter withdraw amount: 50
//Deposit: 100
//Balance: 1100
//Withdraw: 50
//Balance: 1050