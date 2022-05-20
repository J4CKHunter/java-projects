import Company.*;
import java.util.ArrayList;
import java.util.List;


public class TeamTest {
    public static void main(String[] args) {
        List<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee( "Mehmet", "Sade",1, 15));
        employees1.add(new Employee( "Necip", "Marasli",2, 16));
        employees1.add(new Employee( "Behice", "Narin",3, 22));

        Director director = new Director( "Nuri", "Yetis",1, 25, "Sales", 5000);

        Team<Director, Employee> teamOne = new Team<>("Dinazorlar",director, employees1);

        System.out.println(teamOne.getName());
        teamOne.listAllMembers();

        System.out.println();

        
        List<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee( "Serap", "Acar",1, 5));
        employees2.add(new Employee( "Mustafa", "Ferah",2, 1));
        employees2.add(new Employee( "Aysun", "kara",3, 2));

        Manager manager = new Manager( "Ali", "Nazik",10, 7, "Sales");

        Team<Manager, Employee> teamTwo = new Team<>("Fidanlar", manager, employees2);

        System.out.println(teamTwo.getName());
        teamTwo.listAllMembers();
        
    }
}
