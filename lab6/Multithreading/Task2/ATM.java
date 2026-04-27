//create an ATM class which has one class attributes called balance. this ATM class handle two task:
//withdraw and deposit. create Two threads that performs each task; one for deposit, one for withdraw.
//Make sure deposit thread always execute first.




class ATM {
    private int balance = 1000;

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposit: " + amount);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Withdraw: " + amount);
        System.out.println("Balance: " + balance);
    }
}





