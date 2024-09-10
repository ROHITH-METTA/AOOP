package Com.Music_Playlist;
import java.util.LinkedList;
import java.util.List;
public class Playlist {
	private List<Song> songs;

    public Playlist() {
        songs = new LinkedList<>();
    }

    public void addSong(String title, String artist) {
        Song song = new Song(title, artist);
        songs.add(song);
        System.out.println("Added: " + song);
    }

    public void removeSong(String title) {
        boolean found = false;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equalsIgnoreCase(title)) {
                System.out.println("Removed: " + songs.get(i));
                songs.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Song not found: " + title);
        }
    }

    public void moveSong(String title, int newPosition) {
        if (newPosition < 1 || newPosition > songs.size()) {
            System.out.println("Invalid position.");
            return;
        }
        
        Song songToMove = null;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equalsIgnoreCase(title)) {
                songToMove = songs.remove(i);
                break;
            }
        }
        
        if (songToMove != null) {
            songs.add(newPosition - 1, songToMove);
            System.out.println("Moved: " + songToMove + " to position " + newPosition);
        } else {
            System.out.println("Song not found: " + title);
        }
    }

    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (int i = 0; i < songs.size(); i++) {
                System.out.println((i + 1) + ". " + songs.get(i));
            }
        }
    }
}
