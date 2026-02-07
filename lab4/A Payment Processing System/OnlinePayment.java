class OnlinePayment extends Payment {
        String platform;


        OnlinePayment(double amount, String platform) {
            super(amount);
            this.platform = platform;
        }

        void processPayment() {
            System.out.println("Processing online payment via " + platform +
                    " of amount: " + amount);
        }
    }


