package lab18;
import java.util.Scanner;
public class Main {
    private Scanner scanner;
    private Card cardForUser1;
    private Card cardForUser2;

    public Main() {
        scanner = new Scanner(System.in);
        cardForUser1 = new Card(0);
        cardForUser2 = new Card(0);
    }

    public void addBalance(){
        Card currentCard = cardForUser1;
        System.out.println("Current balance of card is " + currentCard.getBalance());
        System.out.println("Please enter an amount in Dollars:");
        int amount = scanner.nextInt();
        currentCard.setBalance(amount * 2);
        System.out.println("Your new current balance of card in credits is " + currentCard.getBalance());
    }

    public void transferBalance() {
        Card currentCard = cardForUser1;
        System.out.println("Press 1 to add money to card 1");
        System.out.println("Press 2 to add money to card 2");
        int select = scanner.nextInt();
        if (select == 2) {
            System.out.println("Card for user 1 was selected");
            currentCard = cardForUser1;
        } else {
            System.out.println("Card for user 2 was selected");
            currentCard = cardForUser2;
        }
        System.out.println("Current balance of card is " + currentCard.getBalance());
        System.out.println("Please enter an amount in Dollars:");
        int amount = scanner.nextInt();
        currentCard.setBalance(amount * 2);
        System.out.println("Your new current balance of card in credits is " + currentCard.getBalance());
    }

    public void checkBalance(){
        Card currentCard = cardForUser1;
        System.out.println("Current balance of card is " + currentCard.getBalance());
    }

    public void purchaseItems() {
        Boolean flag = true;
        while (flag) {
            System.out.println("Please select from menu options: ");
            System.out.println("Press 1 for water");
            System.out.println("Press 2 for soda");
            System.out.println("Press 3 for chips");
            System.out.println("Press 4 for chocolate");
            System.out.println("Press 5 for popcorn");
            int input = scanner.nextInt();
            String[] items = {"Water", "Soda", "Chips", "Chocolate", "Popcorn"};
            Integer[] prices = {1, 2, 1, 2, 1};
            String item = items[0];
            Integer price = prices[0];
            switch (input) {
                case 1:
                    item = items[0];
                    price = prices[0];
                    System.out.println("You have selected " + item + " :$" + price);
                    break;
                case 2:
                    item = items[1];
                    price = prices[1];
                    System.out.println("You have selected " + item + " :$" + price);
                    break;
                case 3:
                    item = items[2];
                    price = prices[2];
                    System.out.println("You have selected " + item + " :$" + price);
                    break;
                case 4:
                    item = items[3];
                    price = prices[3];
                    System.out.println("You have selected " + item + " :$" + price);
                    break;
                case 5:
                    item = items[4];
                    price = prices[4];
                    System.out.println("You have selected " + item + " :$" + price);
                    break;
                default:
                    System.out.println("You selected a unknown option.");
            }


            System.out.println("Please enter your card");
            Card currentCard = cardForUser1;
            Integer balance = currentCard.getBalance();
            balance = balance - price;
            currentCard.setBalance(balance);
            System.out.println("Thank you for your purchase of " + item);
            System.out.println("Current balance of card is " + currentCard.getBalance());
            System.out.println("To make another selection please press 1");
            int next = scanner.nextInt();
            if (next == 1) {
                flag = true;
                break;
            } else {
                flag = false;
                break;
            }
        }
    }

    public void start() {
        Boolean flag = true;
        while (flag) {

            System.out.println("Welcome to terminal, please select from options: ");
            System.out.println("Press 1 to add money to a card");
            System.out.println("Press 2 to transfer credit to another card");
            System.out.println("Press 3 to check your balance");
            System.out.println("Press 4 to purchase items");
            System.out.println("Press 5 to exit");

            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    addBalance();
                    break;
                case 2:
                    transferBalance();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    purchaseItems();
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("You selected a unknown option.");
            }
        }

    }

    public void stop(){
        System.out.println("Thank you for  using our machine");
        System.out.println("\t" + "Please come again!" );
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
        main.stop ();

    }
}
