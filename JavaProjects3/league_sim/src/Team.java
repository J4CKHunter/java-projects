import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;
    private ArrayList<T> squad = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addPlayer(T newPlayer) {

        if (squad.contains(newPlayer)) {
            System.out.println("Player already exist.");
            return false;
        }

        for (T temp : squad) {
            if (temp.getNumber() == newPlayer.getNumber()) {
                System.out.println("Another player using this player number.");
                return false;
            }
        }

        squad.add(newPlayer);
        return true;

    }

        public void listAllSquadMembers(){
            for (T temp:squad) {
                System.out.println(temp.getNumber() + " - " + temp.getName());
            }
        }


        int size = squad.size();
        public int getSquadSize(){
            return size;
        }




    }





