public class ContractedEmployee extends Employee{
    // TODO fix class declaration and declare variables here

    String federalTaxId;
    double hourlyRate;
    public double numberOfHoursWorked;
    private double getHourlyRate;

    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        super(employeeId, name);
        this.federalTaxId = federalTaxId;// TODO fill in code here
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;// TODO fill in code here
    }

    public double getHourlyRate() {
        // TODO fill in code here and replace the return statement
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;// TODO fill in code here
    }

    public double getNumberOfHoursWorked() {
        // TODO fill in code here and replace the return statement
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;// TODO fill in code here
    }

    @Override
    public double calculatePay() {
        return averageMonthlySalary = hourlyRate * numberOfHoursWorked;
    }
    // TODO fill in code here
}