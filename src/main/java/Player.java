import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Player {
    private ArrayList<Card> inventory = new ArrayList<>();
    private int money = 100;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void addToInventory(Card card) {
        inventory.add(card);
    }

    public void clearInventory() {
        inventory = new ArrayList<>();
    }

    public void addMoney(int moneyToAdd) {
        money += moneyToAdd;
    }

    public void removeMoney(int moneyToRemove) {
        money -= moneyToRemove;
    }

    public String getName() {
        return name;
    }

    public void showInventory() {
        System.out.println(name + "'s Inventory:");
        for (Card card : inventory) {
            switch (card.getSuit()) {
                case "hearts" -> System.out.print("♥");
                case "diamonds" -> System.out.print("♦");
                case "clubs" -> System.out.print("♣");
                case "spades" -> System.out.print("♠");
            }
            System.out.print(" " + card.getValue());
            System.out.println();
        }
        System.out.println("Press enter to continue.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    }

    public String showMoney() {
        return "$" + money;
    }

    public boolean askToBuyIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ": Do you want to buy in? You have " + showMoney() + ".");
        if (scanner.nextLine().toLowerCase().contains("yes")) {
            return true;
        } else if (scanner.nextLine().toLowerCase().contains("no")) {
            return false;
        } else {
            System.out.println("Please say yes or no.");
            return askToBuyIn();
        }
    }
}
