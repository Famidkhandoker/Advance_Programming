public class Main {
    public static void main(String[] args) {

        SeniorManager sm =
                new SeniorManager(201, 50000, 10000, 15000);
        Employee empRef = sm;
        PayrollService payroll = new PayrollService();
        payroll.generatePayroll(empRef);
    }
}

//output
// Total Salary: 75000.0
