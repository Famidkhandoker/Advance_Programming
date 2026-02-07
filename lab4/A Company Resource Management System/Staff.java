public class Staff {

        int staffId;
        double basicPay;
        static int totalStaff = 0;

        Staff(int staffId, double basicPay) {
            this.staffId = staffId;
            this.basicPay = basicPay;
            totalStaff++;
        }

        double calculatePay() {
            return basicPay;
        }
    }


