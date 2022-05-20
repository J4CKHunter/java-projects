import java.util.LinkedList;

public class Album {

    private String name;
    LinkedList<Song> songs = new LinkedList<>();

    public Album() {
    }

    public Album(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(Song temp){
        temp.setAlbumName(getName());
        songs.add(temp);
    }

    public void removeSong(Song temp){
        songs.remove(temp);
    }

    @Override
    public String toString() {
        return getName();
    }
}
