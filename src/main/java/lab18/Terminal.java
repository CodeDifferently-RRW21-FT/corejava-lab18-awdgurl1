package lab18;

import java.util.Random;
import java.util.Scanner;

public class Terminal {

    private Scanner scanner;
    Card user[] = {new Card("Tariq", 10), new Card("Kaleb", 10)
            , new Card("Caleb", 10), new Card("Gio", 10), new Card("Loril", 10)};
    Random random = new Random();
    int x = random.nextInt(4) + 0;
    private Card cardForUser1 = user[x];
    private Card cardForUser2 = user[x];

    private Inventory[] items = new Inventory[5];

    public void dispense() {
        items[0] = new Inventory(ItemsEnum.WATER, 2);
        items[1] = new Inventory(ItemsEnum.SODA, 4);
        items[2] = new Inventory(ItemsEnum.CHIPS, 2);
        items[3] = new Inventory(ItemsEnum.CHOCOLATE, 4);
        items[4] = new Inventory(ItemsEnum.POPCORN, 2);
    }

    public void stop() {
        System.out.println("Thank you for  using our machine");
        System.out.println("\t" + "Please come again!");
    }


    public Terminal () {
        scanner = new Scanner(System.in);
    }


    public void addBalance() {
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
        if (select == 1) {
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

    public void checkBalance() {
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
            dispense();
            System.out.println("You have selected " + items[input - 1]);

            System.out.println("Please enter your card");
            Card currentCard = cardForUser1;
            System.out.println("Current balance of card is " + currentCard.getBalance());
            Integer balance = currentCard.getBalance();
            balance = balance - items[input].getPrice();
            currentCard.setBalance(balance);
            System.out.println("Thank you for your purchase of " + items[input]);
            System.out.println("Current balance of card is " + currentCard.getBalance());
            System.out.println("To make another selection please press 1");
            int next = scanner.nextInt();
            if (next == 1) {
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

            System.out.println("Welcome to TDD Vending Machine, please select from options: ");
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
}



