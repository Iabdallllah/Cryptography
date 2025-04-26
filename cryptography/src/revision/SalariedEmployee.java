package revision;
public class SalariedEmployee extends Employee implements displayable {
    private double weeklySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String number, String name, double weeklySalary) {
        super();
        this.weeklySalary = weeklySalary;
    }

}