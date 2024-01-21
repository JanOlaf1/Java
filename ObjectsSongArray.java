public class ObjectsSongArray {
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
        Song[] songs = new Song[3];

        songs[0] = new Song("Easy on Me", "Adele", 2021);
        songs[1] = new Song("Shivers", "Ed Sheeran", 2021);
        songs[2] = new Song("Holy Ghost Fire", "Larkin Poe", 2020);

        System.out.println("=== List of songs ===");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
