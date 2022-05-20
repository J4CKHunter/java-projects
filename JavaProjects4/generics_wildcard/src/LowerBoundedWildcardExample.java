import Company.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LowerBoundedWildcardExample {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Mehmet", "Sade"));
        people.add(new Person("Necip", "Marasli"));
        people.add(new Person("Behice", "Narin"));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mehmet", "Sade", 1,5));
        employees.add(new Employee("Necip", "Marasli",2, 6));
        employees.add(new Employee("Behice", "Narin",3, 2));

        List<Manager> managers = new ArrayList<>();
        managers.add(new Manager("Ali", "Nazik", 10,7, "Sales"));
        managers.add(new Manager("Mahmut", "Tatli",20, 12, "HR"));

        List<Director> directors = new ArrayList<>();
        directors.add(new Director( "Mehmet", "Sade",1, 15, "Sales", 5000));
        directors.add(new Director( "Necip", "Marasli",2, 20, "Production", 8000));


        Consumer<Employee> employeeConsumer = o -> System.out.println("Consumer<Employee>: " + o);
        Consumer<Manager> managerConsumer = o -> System.out.println("Consumer<Manager>: " + o);
        Consumer<Person> personConsumer = o -> System.out.println("Consumer<Person>: " + o);
        Consumer<Object> objectConsumer = o -> System.out.println("Consumer<Object>: " + o);

        employees.forEach(employeeConsumer);
//        employees.forEach(managerConsumer);
        System.out.println();

        managers.forEach(managerConsumer);
        managers.forEach(employeeConsumer);
        System.out.println();

        directors.forEach(managerConsumer);
        directors.forEach(employeeConsumer);
        System.out.println();

//        people.forEach(employeeConsumer);
//        people.forEach(managerConsumer);
        people.forEach(personConsumer);
        people.forEach(objectConsumer);
        System.out.println();

        List<String> sentence = Stream.of("I", "love", "Java", ":)").collect(Collectors.toList());
        sentence.forEach((String s) -> System.out.println(s + " has " + s.length() + " characters."));
        sentence.forEach((Object o) -> System.out.println("Hashcode of " + o + " " + o.hashCode()));
    }
}
