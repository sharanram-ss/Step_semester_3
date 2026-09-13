package week6.assigment_problems;

class EmployeeCompany {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeCompany(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        EmployeeCompany employee1 = new EmployeeCompany("Ravi", 50000);
        EmployeeCompany employee2 = new EmployeeCompany("Anitha", 60000);
        EmployeeCompany employee3 = new EmployeeCompany("Karthik", 55000);

        System.out.println("3 Employee objects created");
        EmployeeCompany.printCompanyInfo();
    }
}