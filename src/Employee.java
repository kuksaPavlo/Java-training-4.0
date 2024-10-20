abstract class Employee implements Payable {
    // TODO fix class declaration and declare variables here
    String employeeId;
    String name;
    double averageMonthlySalary;
    public Employee(String employeeId, String name) {
        this.employeeId =  employeeId;// TODO fill in code here
        this.name = name;
    }


    public String getEmployeeId() {
        return employeeId;// TODO fill in code here and replace the return statement
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;// TODO fill in code here
    }

    public String getName() {
        // TODO fill in code here and replace the return statement
        return name;
    }

    public void setName(String name) {
        this.name = name;// TODO fill in code here
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        // TODO fill in code here and replace the return statement, be sure to format double value
        return "Employee ID: " + employeeId + ", Name: " + name + ", Average Monthly Salary: $" + String.format("%.2f", averageMonthlySalary);
    }

    @Override
    public void calculatePay() {
    }
}