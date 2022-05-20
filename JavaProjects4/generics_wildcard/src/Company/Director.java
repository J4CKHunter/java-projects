package Company;

public class Director extends Manager{
    protected double bonus;

    public Director(String firstName, String lastName, int no, int year, String department, double bonus) {
        super(firstName, lastName, no, year, department);
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("Company.Director is working!");
        manage();
    }

    @Override
    public void manage() {
        System.out.println("Company.Director manages whole company!");
        makeAStrategicPlan();
    }

    public void makeAStrategicPlan(){
        System.out.println("Company.Director makes a strategic plan for the company!");
    }

    @Override
    public double calculateSalary() {
        return 4 * year * Worker.BASE_SALARY;
    }

    @Override
    public String toString() {
        return "Company.Director{" +
                "bonus=" + bonus +
                ", no=" + no +
                ", year=" + year +
                ", department='" + department + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
