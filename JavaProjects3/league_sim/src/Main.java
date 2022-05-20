
public class Main {

    public static void main(String[] args) {

        FootballPlayer footballPlayer = new FootballPlayer();
        BasketballPlayer basketballPlayer = new BasketballPlayer();
        VolleyballPlayer volleyballPlayer = new VolleyballPlayer();

        FootballPlayer ronaldo = new FootballPlayer("Cristiano Ronaldo",34);
        FootballPlayer messi = new FootballPlayer("Linoel Messi",33);
        FootballPlayer kaka = new FootballPlayer("Kaka Leite",38);
        FootballPlayer mbappe = new FootballPlayer("Mbappe",22);
        FootballPlayer neymar = new FootballPlayer("Neymar Jr.",25);
        FootballPlayer yusufyazici = new FootballPlayer("Yusuf Yazici",25);
        FootballPlayer cengizünder = new FootballPlayer("Cengiz Ünder",26);

        Club psg = new Club("Paris Saint Germain");
        psg.makeTeam("Football Team",footballPlayer);
        psg.
    }
}
