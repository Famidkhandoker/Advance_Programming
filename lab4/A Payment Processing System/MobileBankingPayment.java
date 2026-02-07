class MobileBankingPayment extends OnlinePayment {
    String mobileNumber;

    MobileBankingPayment(double amount, String platform, String mobileNumber) {
        super(amount, platform);
        this.mobileNumber = mobileNumber;
    }

    void processPayment() {
        System.out.println("Processing mobile banking payment from " +
                mobileNumber + " via " + platform +
                " of amount: " + amount);
    }
}
