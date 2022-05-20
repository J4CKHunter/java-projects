package Company;

public class Manager extends Employee{

    protected String department;
    public Manager(String firstName, String lastName, int no, int year, String department) {
        super(firstName, lastName, no, year);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("Company.Manager is working.");
        manage();
    }

    public String getDepartment() {
        return department;
    }

    public void manage(){
        System.out.println("Company.Manager is managing.");
    }

    @Override
    public double calculateSalary() {
        return 2 * year * Worker.BASE_SALARY;
    }

    @Override
    public String toString() {
        return "Company.Manager{" +
                "no=" + no +
                ", year=" + year +
                ", department='" + department + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
