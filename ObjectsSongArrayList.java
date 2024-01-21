package testi1;
import java.util.ArrayList;

public class ObjectsSongArrayList {

    public static class Song {
        private String name;
        private String artist;
        private int year;

        public Song(String name, String artist, int year) {
            this.name = name;
            this.artist = artist;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public String getArtist() {
            return artist;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return getArtist() + ": " + getName() + " (" + getYear() + ")";
        }
    }

    public static void main(String[] args) {
        ArrayList<Song> songList = new ArrayList<>();

        Song song1 = new Song("Easy on Me", "Adele", 2021);
        Song song2 = new Song("Shivers", "Ed Sheeran", 2021);
        Song song3 = new Song("Holy Ghost Fire", "Larkin Poe", 2020);

        songList.add(song1);
        songList.add(song2);
        songList.add(song3);

        System.out.println("=== List of songs ===");

        for (Song song : songList) {
            System.out.println(song);
        }
    }
}
