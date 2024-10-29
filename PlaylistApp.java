package semester3;

public class PlaylistApp {

        static class Song {
            String title;
            Song next;

            Song(String title) {
                this.title = title;
                this.next = null;
            }
        }
        static class Playlist {
            private Song head;

            public void addSong(String title) {
                Song newSong = new Song(title);

                if (head == null) {
                    head = newSong;
                } else {
                    Song current = head;
                    while (current.next != null) {
                        current = current.next;
                    }
                    current.next = newSong;
                }
            }

            public void displayPlaylist() {
                if (head == null) {
                    System.out.println("Playlist kosong.");
                } else {
                    Song current = head;
                    while (current != null) {
                        System.out.println("Lagu: " + current.title);
                        current = current.next;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Playlist playlist = new Playlist();

            playlist.addSong("Clarity");
            playlist.addSong("Bugambilya");
            playlist.addSong("Where's My Love");

            playlist.displayPlaylist();
        }
    }
