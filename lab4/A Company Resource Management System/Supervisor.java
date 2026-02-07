class Supervisor extends Staff {
    double supervisionAllowance;

    Supervisor(int staffId, double basicPay, double supervisionAllowance) {
        super(staffId, basicPay);
        this.supervisionAllowance = supervisionAllowance;
    }

    double calculatePay() {
        return basicPay + supervisionAllowance;
    }
}
