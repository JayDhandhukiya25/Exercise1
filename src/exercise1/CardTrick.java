package exercise1;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1); // Random value between 1 and 13
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit from the SUITS array
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int pickedValue = scanner.nextInt();

        System.out.print("Pick a suit (Hearts=1, Diamonds=2, Spades=3, Clubs=4): ");
        int pickedSuit = scanner.nextInt();
        String suit = Card.SUITS[pickedSuit - 1];

        Card pickedCard = new Card();
        pickedCard.setValue(pickedValue);
        pickedCard.setSuit(suit);

        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == pickedCard.getValue() && card.getSuit().equals(pickedCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        }
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is JAY, but you can call me JD");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on essential skill");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Swimming");

        System.out.println();
    }
}
