
package labtask7;

public class LAB1 {
    private int empId;
    private String empName;
    private double empSalary;

    public LAB1(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public static void main(String[] args) {
        
        LAB1 employee1 = new LAB1(1, "LAVEENA", 50000.0);
        LAB1 employee2 = new LAB1(2, "ATISHAY", 60000.0);
        

        LAB1[] employeeArray = {employee1, employee2};

        
        for (LAB1 employee : employeeArray) {
            System.out.println("Employee ID: " + employee.getEmpId() +
                               ", Name: " + employee.getEmpName() +
                               ", Salary: " + employee.getEmpSalary());
        }
    }
}

