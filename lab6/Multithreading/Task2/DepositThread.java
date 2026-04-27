class DepositThread extends Thread {
        ATM atm;
        int amount;

        DepositThread(ATM atm, int amount) {
            this.atm = atm;
            this.amount = amount;
        }

        public void run() {
            atm.deposit(amount);
        }
    }

