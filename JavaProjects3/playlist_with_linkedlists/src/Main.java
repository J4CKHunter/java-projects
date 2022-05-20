import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1 ; i < 14 ; i++){
            numbers.add(i);
        }

        Scanner s = new Scanner(System.in);
        MusicPlayer player = new MusicPlayer();
        player.showMenu();
        int x = s.nextInt();


        while(x!=0){
            player.selection(x);
            x = s.nextInt();

        }

        System.out.println("closing player.");

    }
}
