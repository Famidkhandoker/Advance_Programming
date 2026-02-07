public class Main {
    public static void main(String[] args) {

        MobileBankingPayment mbp =
                new MobileBankingPayment(1500.0, "bKash", "017XXXXXXXX");

        Payment paymentRef = mbp;

        PaymentService service = new PaymentService();
        service.execuA Payment Processing SystemtePayment(paymentRef);
    }
}

//output
// Processing mobile banking payment from 017XXXXXXXX via bKash of amount: 1500.0

