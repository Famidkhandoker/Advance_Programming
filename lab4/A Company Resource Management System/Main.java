public class Main {
    public static void main(String[] args) {


        Staff sup = new Supervisor(101, 20000, 5000);
        Staff man = new Manager(102, 30000, 7000, 10000);
        
        PayrollSystem payroll = new PayrollSystem();

        payroll.generatePaySlip(sup);
        payroll.generatePaySlip(man);

        System.out.println("Total Staff: " + Staff.totalStaff);
    }
}

