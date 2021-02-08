package marsaint.arshiva;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String albumName;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Song>(); // initialise arraylist for song
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    // method to add song into songs
    public boolean addSong(String title, double duration) {
        if (findSongByTitle(title) == null) { // add song only if same song not found
            System.out.println("process to add song: " + title);
            this.songs.add(new Song(title, duration));
            return true;
        }
        System.out.println(title + " already exist");
        return false;
    }

    private Song findSongByTitle(String title) {
        for (Song i : this.songs) {
            if (i.getTitle().equals(title)) {
                System.out.println("Song: " + title + " found");
                return i;
            }
        }
        System.out.println("Song " + title + " not found");
        return null;
    }

    public boolean addSongToPlaylistByTrack(int trackNumber, List<Song> playList) {
        int index = (trackNumber -= 1);
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            System.out.println("<<" + this.songs.get(index).getTitle() + ">>" + " has added into playlist");
            return true;
        }
        System.out.println("track not found, unable to add song into playlist");
        return false;
    }

    public boolean addSongToPlaylistByName(String trackTitle, LinkedList<Song> playList) {
        Song foundSong = findSongByTitle(trackTitle);
        if (foundSong != null) {
            System.out.println("track: " + trackTitle + " added into playlist");
            playList.add(foundSong);
            return true;
        }
        System.out.println("track name not found, unable to add song into playlist");
        return false;
    }

}
