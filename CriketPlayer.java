package criket;
import java.util.Arrays;
import java.util.Scanner;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totalruns;
    double bat_avg;

    CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int totalruns) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totalruns = totalruns;
    }

    static double avg(CricketPlayer player) {
        int timesBatted = player.no_of_innings - player.no_of_times_notout;
        return timesBatted == 0 ? 0 : (double) player.totalruns / timesBatted;
    }

    static void sort(CricketPlayer[] players) {
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = 0; j < players.length - i - 1; j++) {
            	  if (avg(players[j]) < avg(players[j + 1])) {
                      CricketPlayer temp = players[j];
                      players[j] = players[j + 1];
                      players[j + 1] = temp;
                  }
              }
          }
      }

      public String toString() {
          return "Name: " + name + ", Batting Average: " + avg(this);
      }
  }

public class CriketPlayer {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of players: ");
	        int n = scanner.nextInt();

	        CricketPlayer[] players = new CricketPlayer[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter details for player " + (i + 1));
	            System.out.print("Name: ");
	            String name = scanner.next();
	            System.out.print("No of innings: ");
	            int no_of_innings = scanner.nextInt();
	            System.out.print("No of times not out: ");
	            int no_of_times_notout = scanner.nextInt();
	            System.out.print("Total runs: ");
	            int totalruns = scanner.nextInt();

	            players[i] = new CricketPlayer(name, no_of_innings, no_of_times_notout, totalruns);
	        }

	        CricketPlayer.sort(players);

	        System.out.println("\nPlayer Details (Sorted by Batting Average):");
	        for (CricketPlayer player : players) {
	            System.out.println(player);
   }
	}
}
