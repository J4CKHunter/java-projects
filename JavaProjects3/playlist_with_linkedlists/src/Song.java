public class Song {


    private String name;
    private String singer;
    private String albumName;
    private double time;


    public Song() {
    }

    public Song(String name, String singer, double time) {
        this.name = name;
        this.singer = singer;
        this.time = time;
        this.albumName = "Single";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return getName() + "    " + getSinger() + "    " + getTime() + "    " + getAlbumName();
    }
}
