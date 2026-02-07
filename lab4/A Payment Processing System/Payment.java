public class Payment {
        double amount;
        Payment(double amount) {
            this.amount = amount;
        }
        void processPayment() {
            System.out.println("Processing general payment of amount: " + amount);
        }
    }


