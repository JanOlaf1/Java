package testi1;

public class ObjectsSongProgram {

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
            return getName() + " (" + getArtist() + "," + getYear() + ")";
        }
    }

    public static void main(String[] args) {
        Song song1 = new Song("Song 1", "Artist 1", 2021);
        Song song2 = new Song("Song 2", "Artist 2", 2022);
        Song song3 = new Song("Song 3", "Artist 3", 2023);

        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);
    }
}
