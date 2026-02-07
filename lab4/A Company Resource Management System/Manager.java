class Manager extends Supervisor {
    double managementBonus;

    Manager(int staffId, double basicPay,
            double supervisionAllowance, double managementBonus) {
        super(staffId, basicPay, supervisionAllowance);
        this.managementBonus = managementBonus;
    }

    double calculatePay() {
        return basicPay + supervisionAllowance + managementBonus;
    }
}

