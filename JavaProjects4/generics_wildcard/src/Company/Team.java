package Company;

import java.util.List;

public class Team<T extends Manager, E extends Employee> {
    private String name;
    private T teamManager;
    private List<E> members;

    public Team(String name, T teamManager) {
        this.name = name;
        this.teamManager = teamManager;
    }

    public Team(String name, T teamManager, List<E> members) {
        this.name = name;
        this.teamManager = teamManager;
        this.members = members;
    }

    public T getTeamManager() {
        return teamManager;
    }

    public List<E> getMembers() {
        return members;
    }

    public void listMembers(){
        members.forEach(System.out::println);
    }

    public void listAllMembers(){
        System.out.println(teamManager);
        listMembers();
    }

    public boolean isMember(E employee){
        boolean member = false;
        for (E e : members) {
            if(e.equals(employee));
                member = true;
        }
        return member;
    }

    public int getTeamSize(){return members.size() + 1;}

    public String getName() {
        return name;
    }
}
