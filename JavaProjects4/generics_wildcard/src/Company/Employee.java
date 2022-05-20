package Company;

public class Employee extends Person implements Worker, Comparable<Employee>{

    protected int no;
    protected int year;

    public Employee(String firstName, String lastName,int no, int year) {
        super(firstName, lastName);
        this.no = no;
        this.year = year;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void work() {
        System.out.println("Company.Employee is working.");
    }

    @Override
    public double calculateSalary() {
        return year * Worker.BASE_SALARY;
    }

    @Override
    public String toString() {
        return "Company.Employee{" +
                "no=" + no +
                ", year=" + year +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return no;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (no != other.no)
            return false;
        return true;
    }

    @Override
    public int compareTo(Employee o) {
        int compare = 0;
        if (no < o.no)
            compare = -1;
        else if (no > o.no)
            compare = 1;
        return compare;
    }
}
