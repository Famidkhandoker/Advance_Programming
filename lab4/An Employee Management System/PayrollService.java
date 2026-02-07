class PayrollService {

    void generatePayroll(Employee e) {
        double totalSalary = e.calculateSalary();
        System.out.println("Total Salary: " + totalSalary);
    }
}

