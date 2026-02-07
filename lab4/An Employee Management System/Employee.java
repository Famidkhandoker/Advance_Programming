public class Employee {
        int empId;
        double basicSalary;

        Employee(int empId, double basicSalary) {
            this.empId = empId;
            this.basicSalary = basicSalary;
        }
        double calculateSalary() {
            return basicSalary;
        }
    }


