import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Playlist {

    private String name;
    ArrayList<Song> songs = new ArrayList<>();

    public Playlist() {
    }

    public Playlist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(Song temp){
        songs.add(temp);
    }

    public void removeSong(Song temp){
        songs.remove(temp);
    }

    @Override
    public String toString() {
        return getName();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
}
