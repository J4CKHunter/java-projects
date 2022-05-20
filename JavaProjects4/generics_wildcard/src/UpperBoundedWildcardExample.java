import Company.*;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcardExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mehmet", "Sade",1, 5));
        employees.add(new Employee("Necip", "Marasli",2, 6));
        employees.add(new Employee( "Behice", "Narin", 3,2));
        employees.add(new Manager("Ali", "Nazik",10, 7, "Sales"));
        employees.add(new Director("Necip", "Marasli", 2,20, "Production", 8000));

        List<Manager> managers = new ArrayList<>();
        managers.add(new Manager( "Ali", "Nazik", 10,7, "Sales"));
        managers.add(new Manager( "Mahmut", "Tatli", 20,12, "HR"));

        List<Director> directors = new ArrayList<>();
        directors.add(new Director( "Mehmet", "Sade",1, 15, "Sales", 5000));
        directors.add(new Director( "Necip", "Marasli",2, 20, "Production", 8000));

        makeUpTeam(employees);
        makeUpTeam(managers);
        makeUpTeam(directors);

//        makeUpGuardianTeam(employees);
        makeUpGuardianTeam(managers);
        makeUpGuardianTeam(directors);
    }


    public static void makeUpTeam(List<? extends Employee> employees){
        System.out.println("\nCreating a new team with " + employees.size() + " employees. ");
        employees.forEach(System.out::println);
    }

    public static void makeUpGuardianTeam(List<? extends Manager> managers){
        System.out.println("\nCreating a new team with " + managers.size() + " employees. ");
        managers.forEach(System.out::println);
    }
}
