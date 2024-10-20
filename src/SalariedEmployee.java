public class SalariedEmployee extends Employee{
    // TODO fix class declaration and declare variables here
    String employeeId;
    String name;
    String socialSecurityNumber;
    double fixedMonthlyPayment;
    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        this.employeeId =  employeeId;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;// TODO fill in code here
    }

    public String getSocialSecurityNumber() {
        // TODO fill in code here and replace the return statement
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;// TODO fill in code here
    }

    public double getFixedMonthlyPayment() {
        // TODO fill in code here and replace the return statement
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;// TODO fill in code here
    }

    // TODO fill in code here
}