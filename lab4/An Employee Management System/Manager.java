class Manager extends Employee {
    double managementAllowance;

    Manager(int empId, double basicSalary, double managementAllowance) {
        super(empId, basicSalary);
        this.managementAllowance = managementAllowance;
    }

    double calculateSalary() {
        return basicSalary + managementAllowance;
    }
}
