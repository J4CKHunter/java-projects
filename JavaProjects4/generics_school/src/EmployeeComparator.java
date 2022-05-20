import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        int result = 0;

        if (o1.no < o2.no)
            result = -1;
        else if (o1.no > o2.no)
            result = 1;

        return result;
    }
}
