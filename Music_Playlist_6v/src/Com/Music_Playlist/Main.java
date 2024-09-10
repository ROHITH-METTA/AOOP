package Com.Music_Playlist;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = sc.nextLine();
                    playlist.addSong(title, artist);
                    break;
                case 2:
                    System.out.print("Enter the title of the song to remove: ");
                    String removeTitle = sc.nextLine();
                    playlist.removeSong(removeTitle);
                    break;
                case 3:
                    System.out.print("Enter the title of the song to move: ");
                    String moveTitle = sc.nextLine();
                    System.out.print("Enter the new position: ");
                    int newPosition = sc.nextInt();
                    sc.nextLine();  
                    playlist.moveSong(moveTitle, newPosition);
                    break;
                case 4:
                    playlist.displayPlaylist();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}


