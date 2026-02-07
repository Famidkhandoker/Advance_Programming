class SeniorManager extends Manager {
    double performanceBonus;

    SeniorManager(int empId, double basicSalary,
                  double managementAllowance, double performanceBonus) {
        super(empId, basicSalary, managementAllowance);
        this.performanceBonus = performanceBonus;
    }

    double calculateSalary() {
        return basicSalary + managementAllowance + performanceBonus;
    }
}
