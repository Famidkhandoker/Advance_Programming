class WithdrawThread extends Thread {
    ATM atm;
    int amount;

    WithdrawThread(ATM atm, int amount) {
        this.atm = atm;
        this.amount = amount;
    }

    public void run() {
        atm.withdraw(amount);
    }
}
