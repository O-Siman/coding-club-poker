import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Deck deck = new Deck();

        final ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("Omar");
        Player player2 = new Player("Felipe");
        players.add(player1);
        players.add(player2);

        ArrayList<Player> currentRoundPlayers = new ArrayList<>(players);

        // MARK: Game
        int pot = 0;

        // Buy in
        for (Player player : currentRoundPlayers) {
            if (player.askToBuyIn()) {
                player.removeMoney(2);
            } else {
                currentRoundPlayers.remove(player);
            }
        }

        // Give each player 2 cards
        for (int i = 0; i < 2; i++) {
            for (Player player : currentRoundPlayers) {
                player.addToInventory(deck.dealCard());
            }
        }

        // Show the players their cards
        for (Player player : currentRoundPlayers) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press enter to see " + player.getName() + "'s cards.");
            scanner.nextLine();
            player.showInventory();
        }
    }
}
