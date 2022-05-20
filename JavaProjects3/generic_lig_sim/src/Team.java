import java.util.ArrayList;

public class Team<T> {

    private String name;
    ArrayList<T> squad = new ArrayList<>();

    public Team(String name,T teamKind) {
        this.name = name;

    }

    public <T> void addPlayer(T player){
         squad.add(player);
    }
    public <T> void removePlayer(T player){
        squad.remove(player);
    }
    public <T> int numberOfPlayers(T player){
        return squad.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
