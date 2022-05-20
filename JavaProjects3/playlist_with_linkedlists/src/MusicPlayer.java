import sun.awt.image.ImageWatched;

import java.util.*;

public class MusicPlayer {

    Scanner s = new Scanner(System.in);
    Random rand = new Random();
    private ArrayList<Song> allSongs = new ArrayList<>();
    private ArrayList<Album> allAlbums = new ArrayList<>();
    private ArrayList<Playlist> allPlaylists = new ArrayList<>();

    private LinkedList<Song> songQueue = new LinkedList<>();

    ListIterator<Song> songListIterator = allSongs.listIterator();
    ListIterator<Album> albumListIterator = allAlbums.listIterator();
    ListIterator<Playlist> playlistListIterator = allPlaylists.listIterator();

    Song currentSong = new Song();

    Album playingAlbum = new Album();

    Playlist playingPlaylist = new Playlist();

    public MusicPlayer() {

        Song olmazlaraYandim = new Song("Olmazlara Yandım","Ozbi & Gülce Duru",6.11);
        Song sonuYok = new Song("Sonu Yok","Ozbi",3.44);

        Album rakiliLivev1 = new Album("Rakili Live 1.Seri");
        rakiliLivev1.addSong(olmazlaraYandim);


        Song sizBanaAldirmayin = new Song("Siz Bana Aldırmayın","Dolu Kadehi Ters Tut",4.21);
        Song yapmaNolursun = new Song("Yapma N'olursun","Dolu Kadehi Ters Tut",3.04);
        Song sizBanaAldirmayinAkustik = new Song("Siz Bana Aldırmayın - Akustik","Dolu Kadehi Ters Tut",4.21);

        Album akustikhaneSesKaydi = new Album("Akustikhane Ses Kaydi");
        akustikhaneSesKaydi.addSong(sizBanaAldirmayin);
        akustikhaneSesKaydi.addSong(yapmaNolursun);


        Song ankaraylaBozusuruz = new Song("Ankara'yla Bozusuruz","Perdenin Ardındakiler",2.44);


        Song acınınIlaci = new Song("Acının İlaci","Adamlar",4.47);
        Song kapisiKapali = new Song("Kapısı Kapalı","Adamlar",4.46);
        Song zombi = new Song("Zombi","Adamlar",3.55);
        Song sarilirimBirine = new Song("Sarılırım Birine","Adamlar",6.33);

        Album rüyalardaBurusmusuz = new Album("Rüyalarda Buruşmuşuz");
        Album eskiDostumTanklaGelmis = new Album("Eski Dostum Tankla Gelmiş");
        Album dünyaGunlukleri = new Album("Dünya Günlükleri");

        rüyalardaBurusmusuz.addSong(acınınIlaci);
        eskiDostumTanklaGelmis.addSong(kapisiKapali);
        dünyaGunlukleri.addSong(zombi);
        dünyaGunlukleri.addSong(sarilirimBirine);


        allSongs.add(olmazlaraYandim);
        allSongs.add(sonuYok);
        allSongs.add(sizBanaAldirmayin);
        allSongs.add(sizBanaAldirmayinAkustik);
        allSongs.add(yapmaNolursun);
        allSongs.add(ankaraylaBozusuruz);
        allSongs.add(acınınIlaci);
        allSongs.add(kapisiKapali);
        allSongs.add(zombi);
        allSongs.add(sarilirimBirine);

        allAlbums.add(rakiliLivev1);
        allAlbums.add(akustikhaneSesKaydi);
        allAlbums.add(rüyalardaBurusmusuz);
        allAlbums.add(eskiDostumTanklaGelmis);
        allAlbums.add(dünyaGunlukleri);


    }

    public void addNewSong(){

        String name,singer;
        Double time;

        System.out.println("Song name :");
        name = s.nextLine();

        System.out.println("singer :");
        singer = s.nextLine();

        System.out.println("time :");
        time = s.nextDouble();

        allSongs.add(new Song(name,singer,time));

        System.out.println("album : \n1.yes 2.no\\single");

        int x = s.nextInt();

        switch (x){
            case 1:
                System.out.println("enter album name");
                String tempName = s.nextLine();
                int exist=0;

                while(albumListIterator.hasNext()){

                    Album tempAlbum = albumListIterator.next();

                    if(tempAlbum.getName().equals(tempName)){
                        exist=1;
                        break;
                    }
                }

                if(exist == 0){
                    allAlbums.add(new Album(tempName));
                    allAlbums.get(-1).addSong(allSongs.get(-1));
                    break;
                }

                break;

            default :
                break;

        }
    }

    public void addNewAlbum(){

        String name;
        System.out.println("name :");
        name = s.nextLine();

        allAlbums.add(new Album(name));

    }

    public void addNewPlaylist(){
        String name;
        System.out.println("name :");
        name = s.nextLine();

        allPlaylists.add(new Playlist(name));
    }

    public void showMenu(){
        System.out.println( "\n/////////////////////////////////////"+
                            "\n1.list all songs" +
                            "\n2.list all albums" +
                            "\n3.list all playlists" +
                            "\n4.play a song" +
                            "\n5.play a playlist" +
                            "\n6.play a album" +
                            "\n7.new song" +
                            "\n8.new album" +
                            "\n9.new playlist" +
                            "\n10.previous song" +
                            "\n11.next song" +
                            "\n12.rewind" +
                            "\n13.playing now" +
                            "\n0.exit"

        );

    }

    public void selection(int x){


        switch(x){
            case 1 :
                    listAllSongs();
                    break;
            case 2 :
                    listAllAlbums();
                    break;
            case 3 :
                    listAllPlaylists();
                    break;
            case 4 :
                    listAllSongs();
                    int y = s.nextInt();
                    currentSong = allSongs.get(y+1);
                    songQueue.clear();
                    songQueue.add(currentSong);
                    System.out.println("playing " + currentSong.toString());
                    break;
            case 5 :
                   listAllPlaylists();
                   int q = s.nextInt();
                   playingPlaylist = allPlaylists.get(q+1);
                   songListIterator = playingPlaylist.songs.listIterator();
                   songQueue.clear();
                   while(songListIterator.hasNext()){
                        songQueue.add(songListIterator.next());
                   }
                   currentSong = songQueue.getFirst();
                   songListIterator = songQueue.listIterator();
                   songListIterator.next();
                   System.out.println("playing " + currentSong.toString());
                    break;
            case 6 :
                    listAllAlbums();
                    int w = s.nextInt();
                    playingAlbum = allAlbums.get(w+1);
                    songListIterator = playingAlbum.songs.listIterator();
                    songQueue.clear();
                    while (songListIterator.hasNext()) {
                        songQueue.add(songListIterator.next());
                    }
                    currentSong = songQueue.getFirst();
                    songListIterator = songQueue.listIterator();
                    songListIterator.next();
                    System.out.println("playing " + currentSong.toString());
                    break;
            case 7 :
                    addNewSong();
                    break;
            case 8 :
                    addNewAlbum();
                    break;
            case 9 :
                    addNewAlbum();
                    break;
            case 10 :
                    if(songListIterator.hasPrevious()){
                        currentSong = songListIterator.previous();
                        System.out.println("playing " + currentSong.toString());
                    }
                    else{
                        System.out.println("there's no song in the queue.playing random one.");
                        currentSong = allSongs.get(rand.nextInt(allSongs.size()+1));
                        System.out.println("playing " + currentSong);
                    }
                    break;
            case 11 :
                    if(songListIterator.hasNext()){
                        currentSong = songListIterator.next();
                        System.out.println("playing " + currentSong.toString());
                    }
                    else{
                        System.out.println("there's no song in the queue.playing random one.");
                        currentSong = allSongs.get(rand.nextInt(allSongs.size()+1));
                        System.out.println("playing " + currentSong);
                    }
                    break;
            case 12 :
                    if(currentSong!=null){
                        System.out.println("playing again " + currentSong.toString());
                    }
                    else{
                        System.out.println("you're not playing any song.playing random one.");
                        currentSong = allSongs.get(rand.nextInt(allSongs.size()+1));
                        System.out.println("playing " + currentSong);
                    }
                    break;
            case 13 :
                    if(currentSong!=null)
                        System.out.println("playing again " + currentSong.toString());

                    else
                        System.out.println("you're not playing any song.playing random one.");

                    break;
            default:
                    System.out.println("wrong entry");
                    break;
        }

        showMenu();

    }

    public void listAllSongs(){

        songListIterator = allSongs.listIterator();
        ListIterator<Song> tempIterator = allSongs.listIterator();

        while(songListIterator.hasNext()){
            System.out.println((allSongs.indexOf(songListIterator.next()) + 1) + ". "
                    + tempIterator.next().toString());
        }
    }

    public void listAllAlbums(){
        albumListIterator = allAlbums.listIterator();
        ListIterator<Album> tempIterator = allAlbums.listIterator();

        while(albumListIterator.hasNext()){
            System.out.println((allAlbums.indexOf(albumListIterator.next())+1) + ". "
                    + tempIterator.next().toString());
        }
    }

    public void listAllPlaylists(){

        playlistListIterator = allPlaylists.listIterator();

        while(playlistListIterator.hasNext()){
            System.out.println((allPlaylists.indexOf(playlistListIterator.next())+1) + ". "
                    + playlistListIterator.next().toString());
        }
    }





}

