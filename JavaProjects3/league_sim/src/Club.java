import java.util.ArrayList;

public class Club {
    private String name;

    ArrayList<Team> teams = new ArrayList<>();

    public Club(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public <T extends Player> void makeTeam(String name,T player){
        Team<T> newTeam = new Team<>(name);
        teams.add(newTeam);
    }

}
