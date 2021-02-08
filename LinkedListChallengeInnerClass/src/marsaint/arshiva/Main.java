package marsaint.arshiva;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        //build albums
        Album somAlbum = new Album("Secret of Mana", "Hiroki Kikuta");
        albums.add(somAlbum);
        Album ff7Album = new Album("Final Fantasy 7", "Nobuo Uematsu");
        albums.add(ff7Album);

        somAlbum.addSong("som-1", 3.15);
        somAlbum.addSong("som-2", 1.45);
        somAlbum.addSong("som-3", 2.23);
        somAlbum.addSong("som-4", 1.12);
        somAlbum.addSong("som-5", 3.38);
        somAlbum.addSong("som-6", 4.09);
        somAlbum.addSong("som-5", 3.38);
        somAlbum.addSong("som-6", 4.09);

        ArrayList<Song> somSongs = somAlbum.getSongs();
        for (Song i : somSongs) {
            System.out.println(i.toString());
        }

        ff7Album.addSong("ff7-1", 3.15);
        ff7Album.addSong("ff7-2", 1.45);
        ff7Album.addSong("ff7-3", 2.23);
        ff7Album.addSong("ff7-4", 1.12);
        ff7Album.addSong("ff7-5", 3.38);
        ff7Album.addSong("ff7-6", 4.09);
        ff7Album.addSong("ff7-5", 3.38);
        ff7Album.addSong("ff7-6", 4.09);

        ArrayList<Song> ff7Songs = ff7Album.getSongs();
        for (Song i : ff7Songs) {
            System.out.println(i.toString());
        }

        //create playlist
        LinkedList<Song> myPlayList = new LinkedList<Song>();

        somAlbum.addSongToPlaylistByTrack(1, myPlayList);
        somAlbum.addSongToPlaylistByTrack(2, myPlayList);
        somAlbum.addSongToPlaylistByTrack(3, myPlayList);
        somAlbum.addSongToPlaylistByTrack(4, myPlayList);
        somAlbum.addSongToPlaylistByTrack(10, myPlayList);

        ff7Album.addSongToPlaylistByName("ff7-2", myPlayList);
        ff7Album.addSongToPlaylistByName("ff7-3", myPlayList);
        ff7Album.addSongToPlaylistByName("ff7-4", myPlayList);
        ff7Album.addSongToPlaylistByName("ff7-5", myPlayList);
        ff7Album.addSongToPlaylistByName("ff8-6", myPlayList);

        findAlbumByName("Secret of Mana");

        play(myPlayList);
    }

    // linked list and listIterator
    public static void play(LinkedList<Song> playList) {

        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("playlist is empty");
            return;
        } else {

            System.out.println("testing listIterator: " + listIterator.next().toString());

            boolean quit = false;
            boolean movingForward = true;
            int action = 0;
            printManual();
            while (!quit) {
                System.out.println("choose your action: ");
                action = scanner.nextInt();
                scanner.nextLine();
                switch (action) {
                    case 1:
                        System.out.println("create album: " +
                                "enter your album name: ");
                        String albumName = scanner.nextLine();
                        System.out.println("album's artist name: ");
                        String artistName = scanner.nextLine();
                        Album newAlbum = new Album(albumName, artistName);
                        albums.add(newAlbum);
                        System.out.println("new album created");
                        break;
                    case 2:
                        System.out.println("adding song into album: " +
                                "enter song's title: ");
                        String songTitle = scanner.nextLine();
                        System.out.println("song's duration: ");
                        double songDuration = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("add this song into which album? album name: ");
                        String checkAlbumName = scanner.nextLine();
                        Album checkedAlbum = findAlbumByName(checkAlbumName);
                        if (checkedAlbum != null) {
                            System.out.println("add song into " + checkedAlbum.getAlbumName() + " album");
                            checkedAlbum.addSong(songTitle, songDuration);
                        } else {
                            System.out.println("error adding song into album");
                        }
                        break;
                    case 3:
                        //play next song
                        if (!movingForward) { // fix cursor position
                            if (listIterator.hasNext()) {
                                listIterator.next();
                                movingForward = true;
                            }
                        }
                        if (listIterator.hasNext()) {
                            System.out.println("playing: " + listIterator.next());
                        }
                        break;
                    case 4:
                        //play previous song
                        if (movingForward) { // fix cursor position
                            if (listIterator.hasPrevious()) {
                                listIterator.previous();
                                movingForward = false;
                            }
                        }
                        if (listIterator.hasPrevious()) {
                            System.out.println("playing: " + listIterator.previous());
                        }
                         break;
                    case 5:
                        //repeat
                        if (!movingForward) {
                            if (listIterator.hasNext()) {
                                System.out.println("repeating: " + listIterator.next().toString());
                                movingForward = true;
                            } else {
                                System.out.println("end of the list");
                            }
                        } else {
                            if (listIterator.hasPrevious()) {
                                System.out.println("repeating: " + listIterator.previous().toString());
                                movingForward = false;
                            } else {
                                System.out.println("start of the list");
                            }
                        }
                        break;
                    case 8:
                        printPlaylist(playList);
                        break;
                    case 9:
                        quit = true;
                        break;
                    default:
                        printManual();
                        break;
                }
            }
        }
    }

    private static void printManual() {
        System.out.println("Printing Manual: ... ");
    }

    private static Album findAlbumByName(String name) {
        for (Album i : albums) {
            if (i.getAlbumName().equals(name)) {
                System.out.println("Album found");
                return i;
            }
        }
        System.out.println("Album not found");
        return null;
    }

    private static void printPlaylist(LinkedList<Song> playList) {
        for (Song i : playList) {
            System.out.println(i.toString());
        }
    }
}
